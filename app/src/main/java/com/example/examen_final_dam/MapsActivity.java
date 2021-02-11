package com.example.examen_final_dam;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public TextView longitud;
    public TextView latitud;
    public TextView marcador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera


        longitud=(TextView)findViewById(R.id.longitud);
        String longitud=getIntent().getStringExtra("longitud");

        latitud=(TextView)findViewById(R.id.latitud);
        String latitud=getIntent().getStringExtra("latitud");

        marcador=(TextView)findViewById(R.id.marcador);
        String marcador=getIntent().getStringExtra("marcador");

        double longitud1= Double.parseDouble(String.valueOf(longitud));
        double latitud1= Double.parseDouble(String.valueOf(latitud));
        LatLng sydney = new LatLng(longitud1, latitud1);
        mMap.addMarker(new MarkerOptions().position(sydney).title(marcador));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}