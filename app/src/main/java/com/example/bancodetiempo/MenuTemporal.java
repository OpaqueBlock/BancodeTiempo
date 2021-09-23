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
    public void goList(View view){
        Intent intent=new Intent(MenuTemporal.this, FiltroOfertas.class);
        startActivity(intent);
    }
}