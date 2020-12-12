package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //DATOS
    String[] datos = {
            "Mole",
            "Tacos",
            "Burritos",
            "Tostadas",
            "Enchiladas",
            "Tortas",
            "Tamales",
            "Hamburgesas",
            "Pizza",
            "Quesadillas",
            "Tinga",
            "Posole",
            "Menudo",
            "Alitas",
            "HOT DOG",
            "Flautas",
            "Montados ",
            "Gorditas",
            "Carnitas",};

    ListView listVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listVwDatos = findViewById(R.id.listVwDatos);

        listVwDatos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                datos
        ));

        listVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),datos[i],Toast.LENGTH_SHORT).show();
            }
        });

    }
}