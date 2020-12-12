package com.example.eva1_16_alert_dialogo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSowAlertDialog(View v) {
        //AlertDialog miCuadroDialogo = new ......
        //miCuadroDialogo.setTitle...
        new AlertDialog.Builder(this)
                .setTitle("CUADRO DE DIÁLOGO DE ANDROID")
                .setMessage("Cuadro de diálogo")
                //.setIcon(R.drawable.ic_launcher_foreground)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("ALERT DIALOG","YES");
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("ALERT DIALOG","NO");
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.wtf("ALERT DIALOG","CANCEL");
                    }
                })
                .create()
                .show();
    }

    public void onSowMyAlertDialog(View v) {
        final Dialog miCuadroDialogo = new Dialog(this);
        miCuadroDialogo.setContentView(R.layout.mi_dialogo);
        TextView txtVwTitu;
        txtVwTitu = miCuadroDialogo.findViewById(R.id.txtVwTitu);
        txtVwTitu.setText("ESTE ES MI CUADRO DE DIALOGO");
        final EditText editTxDatos;
        editTxDatos = miCuadroDialogo.findViewById(R.id.editTxDatos);
        Button btnOk;
        btnOk = miCuadroDialogo.findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String sCade;
                sCade = editTxDatos.getText().toString();
                Log.wtf("CUADRO PERSONAL", sCade);
                miCuadroDialogo.dismiss();

            }
        });
        miCuadroDialogo.show();
    }
}