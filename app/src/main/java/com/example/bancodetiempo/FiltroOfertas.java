package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FiltroOfertas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtro_ofertas);
    }

    public void goList(View view){
        Intent intent=new Intent(FiltroOfertas.this, listadoOfertas.class);
        startActivity(intent);
    }
}