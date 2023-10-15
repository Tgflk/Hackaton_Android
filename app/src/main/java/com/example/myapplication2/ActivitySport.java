package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivitySport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_sport_menu = (ImageButton) findViewById(R.id.im_btn_sport_menu);

        im_btn_sport_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivitySport.this, Main_Menu.class));
            }
        });
    }
}