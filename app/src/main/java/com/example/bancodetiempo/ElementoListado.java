package com.example.bancodetiempo;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ElementoListado extends AppCompatActivity {
    public String nombre;
    public String trabajo;
    public String foto;
    public String color;

    public ElementoListado(String nombre, String trabajo, String color) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void goDetails(View view){
        Intent intent=new Intent(ElementoListado.this, DetallesOfertas.class);
        startActivity(intent);

    }
}
