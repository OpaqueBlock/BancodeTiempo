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


    public void goValidate(View view){
        setContentView(R.layout.activity_pagina_verificacion);
    }
    public void goFavorite(View view){
        setContentView(R.layout.activity_pagina_favoritos);
    }

}