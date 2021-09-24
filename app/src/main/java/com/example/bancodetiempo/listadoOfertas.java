package com.example.bancodetiempo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class listadoOfertas extends AppCompatActivity {

    List<ElementoListado> ofertas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_ofertas);

        init();
    }

    public void init(){
        ofertas=new ArrayList<>();
        ofertas.add(new ElementoListado("Marco Almazan", "Carpintero", "#ff0000"));
        /*ofertas.add(new ElementoListado("Sandra", "A", "#ff0000"));
        ofertas.add(new ElementoListado("Pedro", "A", "#ffcd00"));
        ofertas.add(new ElementoListado("Sandra", "A", "#ffcd00"));*/

        AdaptadorListado lista=new AdaptadorListado(ofertas, this);
        RecyclerView recyclerView=findViewById(R.id.listaOfertas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(lista);
    }
}