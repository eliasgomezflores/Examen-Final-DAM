package com.example.examen_final_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {
    private EditText longitud;
    private EditText latitud;
    private EditText marcador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        longitud=(EditText)findViewById(R.id.longitud);
        latitud=(EditText)findViewById(R.id.latitud);
        marcador=(EditText)findViewById(R.id.marcador);
    }
    public void Maps(View view){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("longitud",longitud.getText().toString());
        i.putExtra("latitud",latitud.getText().toString());
        i.putExtra("marcador",marcador.getText().toString());
        startActivity(i);
    }
}