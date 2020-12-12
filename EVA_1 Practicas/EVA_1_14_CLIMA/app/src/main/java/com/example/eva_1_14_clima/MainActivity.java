package com.example.eva_1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Weather[] weathers = {
            new Weather("Chihuahua", 20, "Lluvias Ligeras", R.drawable.light_rain),
            new Weather("Cd.Juárez", 25, "Nublado", R.drawable.cloudy),
            new Weather("Camargo", 23.3, "Vientos moderados", R.drawable.atmospher),
            new Weather("Parral", 15, "Luvia ligera", R.drawable.light_rain),
            new Weather("Jimaeaz", 30, "Soliado", R.drawable.sunny),
            new Weather("Cuauhtemoc", 12.5, "Nevada intensa", R.drawable.snow),
            new Weather("Aldama", 24, "Lluvia intensa", R.drawable.thunderstorm),
            new Weather("Casas Grandes", 30, "Lluvioso", R.drawable.rainy),
            new Weather("Ojinaga", 32, "Nublado", R.drawable.cloudy),
            new Weather("Creel", 18, "Tornados", R.drawable.tornado),
            new Weather("Batopilas", 17.2, "Lluvias intensa", R.drawable.thunderstorm),
    };
    ListView listVwWeather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listVwWeather = findViewById(R.id.listVwWeather);
        listVwWeather.setAdapter(new WeatherAdapter(
                this,
                R.layout.layout_weather,
                weathers
        ));
    }
}