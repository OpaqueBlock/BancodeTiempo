package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = findViewById(R.id.button4);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.e('tag','prueba');
                setContentView(R.layout.activity_menu_temporal);
            }
        });
    }


    public void goValidate(View view){
        setContentView(R.layout.activity_pagina_verificacion);
    }
    public void goFavorite(View view){
        setContentView(R.layout.activity_pagina_favoritos);
    }

    public void goInicio(View view){
        setContentView(R.layout.activity_menu_temporal);
    }

    public void goBDT(View view){
        Intent intent=new Intent(Login.this, PaginaPrincipal.class);
        startActivity(intent);
    }



}