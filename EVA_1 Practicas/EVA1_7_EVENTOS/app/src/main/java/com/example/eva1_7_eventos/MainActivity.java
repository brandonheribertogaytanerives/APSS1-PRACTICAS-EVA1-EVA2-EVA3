package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    Button btnInListener, btnPorClaseAnomima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInListener = findViewById(R.id.btnInListener);
        btnPorClaseAnomima = findViewById(R.id.btnPorClaseAnomima);

        btnInListener.setOnClickListener(this);
        final Context context=getApplicationContext();
        btnPorClaseAnomima.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "HOLA MUNDO", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
    //EVENTO CLICK
    public void miClick(View v){
        Toast.makeText(this, "HOLA MUNDO", Toast.LENGTH_SHORT).show();
        Log.wtf("MENSAJE","FALLA CATASTRÓFICA");
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "EVENTO POR INTERFAZ", Toast.LENGTH_SHORT).show();
    }

}