package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FiltroOfertas extends AppCompatActivity {
    Button btnCarpinteria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtro_ofertas);
        btnCarpinteria = findViewById(R.id.button7);
        btnCarpinteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent list = new Intent(FiltroOfertas.this, listadoOfertas.class);
                startActivity(list);
            }
        });
    }

    public void goList(View view){
        Intent intent=new Intent(FiltroOfertas.this, listadoOfertas.class);
        startActivity(intent);
    }
}