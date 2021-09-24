package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MenuTemporal extends AppCompatActivity {
    Button btnFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_temporal);
        btnFilter = findViewById(R.id.button24);
        btnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filter = new Intent(MenuTemporal.this, FiltroOfertas.class);
                startActivity(filter);
            }
        });

    }
    public void goPerfil(View view) {
        Intent intent = new Intent(MenuTemporal.this, PerfilUsuario.class);
        startActivity(intent);
    }
  
    public void createOffer(View view){
        Intent intent= new Intent(MenuTemporal.this,NuevaOferta.class);
        startActivity(intent);
    }

    public void goList(View view){
        Intent intent=new Intent(MenuTemporal.this, FiltroOfertas.class);
        startActivity(intent);
    }
}