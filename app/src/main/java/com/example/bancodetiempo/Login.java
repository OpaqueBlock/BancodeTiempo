package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goBDT(View view){
        Intent intent=new Intent(Login.this, PaginaPrincipal.class);
        startActivity(intent);


    }

    public void goInicio(View view){
        setContentView(R.layout.activity_pagina_inicio);
    }

}