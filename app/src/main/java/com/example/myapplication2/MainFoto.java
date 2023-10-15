package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainFoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_foto);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_sauna_menu = (ImageButton) findViewById(R.id.im_btn_sauna_menu);

        im_btn_sauna_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFoto.this, Main_Menu.class));
            }
        });
    }
}

