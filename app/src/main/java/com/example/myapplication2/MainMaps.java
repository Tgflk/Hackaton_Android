package com.example.myapplication2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainMaps extends AppCompatActivity {
    Button button_what;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maps);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton im_btn_map_menu = (ImageButton) findViewById(R.id.im_btn_map_menu);

        button_what = (Button) findViewById(R.id.button_what);

        im_btn_map_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMaps.this, Main_Menu.class));

                button_what.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://t.me/botyara_19bot"));
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
