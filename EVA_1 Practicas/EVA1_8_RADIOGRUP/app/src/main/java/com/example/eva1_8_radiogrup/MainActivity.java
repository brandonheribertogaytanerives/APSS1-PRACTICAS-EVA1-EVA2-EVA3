package com.example.eva1_8_radiogrup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdGrupDulces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGrupDulces = findViewById(R.id.rdGrupDulces);

        rdGrupDulces.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        RadioButton radioButton= findViewById(i);
                        Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_SHORT).show();                    }
                }
        );
    }

}