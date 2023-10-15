package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView variableTextView;
    Timer timer;
    GetWeather gw = new GetWeather();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            JSONObject weather = gw.getWeather("Orenburg", "00e95f8471360abf5346f0a5645a1a41");
            // температура в городе
            double temp = weather.getJSONObject("main").getDouble("temp");
        } catch (Exception e){
            System.out.println("Error!");
        }


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Main_Menu.class);
                startActivity(intent);
                finish();

            }
        }, 3000);
    }
}