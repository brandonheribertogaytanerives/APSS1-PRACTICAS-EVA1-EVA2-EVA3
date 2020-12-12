package com.example.eva_1_14_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    private Context context;
    private int resource;
    private Weather[] objects;


    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){//PRIMERA VEZ QUE EJECUTAMOS LA APP. CREAR CADA UNA DE LAS FILAS
            //INFLAR -->inflate
            convertView = ((Activity)context).getLayoutInflater().inflate(resource, parent, false);
        }
        //LAYOUT CREADO, ACCESIBLE ATRAVÉS DE convertview
        TextView txtVwCity, txtVwTemp, textVwDesc;
        ImageView imgVwImage;
        txtVwCity = convertView.findViewById(R.id.textVwCity);
        txtVwTemp = convertView.findViewById(R.id.textVwTemp);
        textVwDesc = convertView.findViewById(R.id.textVwDesc);
        imgVwImage = convertView.findViewById(R.id.imgVwImage);

        txtVwCity.setText(objects[position].getCity());
        txtVwTemp.setText(objects[position].getTemp() + " °C");
        textVwDesc.setText(objects[position].getDesc());
        imgVwImage.setImageResource(objects[position].getImageWeather());

        return convertView;

    }
}
