package com.unknown.vistaequipos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread background = new Thread(){
            public void run(){
                try {
                    sleep(2500);
                    Intent i = new Intent(getBaseContext(),activity_card.class);
                    startActivity(i);
                    finish();
                }catch (Exception e){
                }
            }
        };
        background.start();
    }
}