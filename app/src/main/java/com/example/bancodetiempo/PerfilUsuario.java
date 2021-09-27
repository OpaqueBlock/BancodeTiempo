package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerfilUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
    }

    public void goUserData(View view) {
        Intent intent=new Intent(PerfilUsuario.this, DatosUsuario.class);
        startActivity(intent);
    }

    public void goUserDoc(View view) {
        Intent intent=new Intent(PerfilUsuario.this, DocumentosUsuario.class);
        startActivity(intent);
    }
}