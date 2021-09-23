package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
    }

    public void goVerification(View view){
        Intent intent=new Intent(PaginaPrincipal.this, PaginaVerificacion.class);
        startActivity(intent);
    }

}