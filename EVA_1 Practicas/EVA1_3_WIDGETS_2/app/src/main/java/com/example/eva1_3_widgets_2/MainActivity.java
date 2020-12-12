package com.example.eva1_3_widgets_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //DECLARAR UN OBJETO DEL MISMO TIPO DEL WIDGET A MODIFICAR O LEER
    TextView txtVwHolMundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //NO EXISTE LA INTERFAZ GRÁFICA
        setContentView(R.layout.activity_main);
        //YA EXSISTE LA INTERFAZ GRÁFICA
        //VINCULAR EL COMPONENTE
        txtVwHolMundo = findViewById(R.id.txtVwDatos);
        txtVwHolMundo.setText("MI PRIMER CODIGO EN ANDROID:)");

    }
}