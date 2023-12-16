package com.example.drivinglicenceind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button openWebViewButton;
    Button clii;
    Button clii2;
    Button clii3;
    Button clii4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        openWebViewButton = findViewById(R.id.openWebViewButton);

        openWebViewButton.setOnClickListener(v -> {
            // Create an intent to open the WebView activity
            Intent intent = new Intent(MainActivity3.this, WebViewActivity.class);
            startActivity(intent);
        });

            clii = this.<Button>findViewById(R.id.clii);
            clii.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity3.this, trafficsigns.class);
                startActivity(intent);
            });
        clii2 = this.<Button>findViewById(R.id.clii2);
        clii2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity3.this, webview2.class);
            startActivity(intent);
        });
         clii3= this.<Button>findViewById(R.id.clii3);
        clii3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity3.this, webview3.class);
            startActivity(intent);
        });
        clii4 = this.<Button>findViewById(R.id.clii4);
        clii4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity3.this, webview4.class);
            startActivity(intent);
        });
    }
}
