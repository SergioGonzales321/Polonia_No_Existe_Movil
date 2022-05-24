package com.unknown.vistaequipos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class activity_card extends AppCompatActivity {

    TextView puntosAnotados,puntosFavor,puntosContra,
            cestosAnotados1,cestosAnotados2,cestosAnotados3,
            cambiosRealizados,faltasTecnicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        inicializaViews();

        //setDatos();


    }

    /*private void setDatos() {
        for(int i=0; i<8;i++){
            int numero = (int) (Math.random() * 99) + 1;
            Toast.makeText(this, "Aleatorio:"+numero, Toast.LENGTH_SHORT).show();
        }

    }*/

    private void inicializaViews() {
        puntosAnotados = findViewById(R.id.puntosAnotados);
        puntosFavor = findViewById(R.id.puntosFavor);
        puntosContra = findViewById(R.id.puntosContra);
        cestosAnotados1 = findViewById(R.id.cestosAnotados1);
        cestosAnotados2 = findViewById(R.id.cestosAnotados2);
        cestosAnotados3 = findViewById(R.id.cestosAnotados3);
        cambiosRealizados = findViewById(R.id.cambiosRealizados);
        faltasTecnicas = findViewById(R.id.faltasTecnicas);
    }
}