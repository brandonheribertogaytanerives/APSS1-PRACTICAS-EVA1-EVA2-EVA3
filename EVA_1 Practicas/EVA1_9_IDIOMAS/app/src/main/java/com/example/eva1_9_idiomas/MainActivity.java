package com.example.eva1_9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup rdGrplidioma;
    RadioButton rdBtnEs, rdBtnEn, rdBtnMucho, rdBtnPoco, rdBtnNada;
    TextView txtVwNom,txtVwApe, txtVwsex;
    EditText edTxtNom, edTxtApe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrplidioma = findViewById(R.id.rdGrplidioma);
        rdBtnEn = findViewById(R.id.rdBtnEn);
        rdBtnEs = findViewById(R.id.rdBtnEs);
        rdBtnMucho = findViewById(R.id.rdBtnMucho);
        rdBtnPoco = findViewById(R.id.rdBtnPoco);
        rdBtnNada = findViewById(R.id.rdBtnNada);
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwApe = findViewById(R.id.txtVwApe);
        txtVwsex = findViewById(R.id.txtVwsex);
        edTxtNom = findViewById(R.id.edtTxtNom);
        edTxtApe = findViewById(R.id.edtTxtApe);

        rdGrplidioma.setOnCheckedChangeListener(
        new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if (i == R.id.rdBtnEs){
                            rdBtnEn.setText(R.string.btn_es_español);
                            rdBtnEs.setText(R.string.btn_es_ingles);
                            rdBtnMucho.setText(R.string.btn_es_mucho);
                            rdBtnPoco.setText(R.string.btn_es_poco);
                            rdBtnNada.setText(R.string.btn_es_nada);
                            txtVwNom.setText(R.string.txt_es_nombre);
                            txtVwApe.setText(R.string.txt_es_apellidos);
                            txtVwsex.setText(R.string.txt_es_sexo);
                            edTxtNom.setText(R.string.hint_es_nombre);
                            edTxtApe.setText(R.string.hint_es_apellido);
                        }else if (i == R.id.rdBtnEn){
                            rdBtnEn.setText(R.string.btn_en_enpañol);
                            rdBtnEs.setText(R.string.btn_en_ingles);
                            rdBtnMucho.setText(R.string.btn_en_mucho);
                            rdBtnPoco.setText(R.string.btn_en_poco);
                            rdBtnNada.setText(R.string.btn_en_nada);
                            txtVwNom.setText(R.string.txt_en_nombre);
                            txtVwApe.setText(R.string.txt_en_apellidos);
                            txtVwsex.setText(R.string.txt_en_sexo);
                            edTxtNom.setText(R.string.hint_en_nombre);
                            edTxtApe.setText(R.string.hint_en_apellido);
                        }
                    }
                }

        );
    }

}