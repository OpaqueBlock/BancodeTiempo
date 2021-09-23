package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaginaVerificacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_verificacion);
    }

    public void goStart(View view){
        Intent intent=new Intent(PaginaVerificacion.this, MenuTemporal.class);
        startActivity(intent);
        finish();
        setContentView(R.layout.activity_menu_temporal);


    }
}