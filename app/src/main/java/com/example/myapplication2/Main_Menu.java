package com.example.myapplication2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Main_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_1_menu = (ImageButton) findViewById(R.id.im_btn_1_menu);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_2_menu = (ImageButton) findViewById(R.id.im_btn_2_menu);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_3_menu = (ImageButton) findViewById(R.id.im_btn_3_menu);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_4_menu = (ImageButton) findViewById(R.id.im_btn_4_menu);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_5_menu = (ImageButton) findViewById(R.id.im_btn_5_menu);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_6_menu = (ImageButton) findViewById(R.id.im_btn_6_menu);

        im_btn_1_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this, ActivityHome.class));
            }
        });
        im_btn_2_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this, MainVeranda.class));
            }
        });
        im_btn_3_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this, ActivitySport.class));
            }
        });
        im_btn_4_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this, MainSauna.class));
            }
        });
        im_btn_5_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this, MainFoto.class));
            }
        });
        im_btn_6_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main_Menu.this, MainMaps.class));
            }
        });
    }
}