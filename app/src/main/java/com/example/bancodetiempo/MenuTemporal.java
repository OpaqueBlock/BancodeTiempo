package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MenuTemporal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_temporal);
    }

    public void goPerfil(View view) {
        Intent intent = new Intent(MenuTemporal.this, PerfilUsuario.class);
        startActivity(intent);
    }

}