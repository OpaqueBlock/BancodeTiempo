package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuTemporal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_temporal);
    }

    public void goAjustes (View view) {
        Intent miIntent = new Intent(MenuTemporal.this, Ajustes.class);
        startActivity(miIntent);
    }
}