package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView  txtVwDatos;
    ImageView imVwMinion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imVwMinion = findViewById(R.id.imgVwMinion);
        txtVwDatos = findViewById(R.id.txtVwDatos);
        imVwMinion.setImageResource(R.drawable.minion);
        txtVwDatos.setText(R.string.mis_datos);


    }
}