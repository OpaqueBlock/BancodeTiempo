package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
    }

    public void boton(View view){
        Intent intent=new Intent(Bienvenida.this, Login.class);
        startActivity(intent);


    }

    //public void boton(View view){
     //   setContentView(R.layout.activity_login);
    //}
}