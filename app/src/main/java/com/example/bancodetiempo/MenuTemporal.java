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
    public void newOffer(View view){
        Intent intent=new Intent(MenuTemporal.this, NuevaOferta.class);
        startActivity(intent);
    }
    public void userProfile(View view){
        Intent intent=new Intent(MenuTemporal.this, PerfilUsuario.class);
        startActivity(intent);
    }
    public void settings(View view){
        Intent intent=new Intent(MenuTemporal.this, Ajustes.class);
        startActivity(intent);
    }

    //NO HAY OFERTAS PUBLICADAS, CREO QUE TAMBIEN SE PERDIO
    /*public void publishedOffers(View view){
        Intent intent=new Intent(MenuTemporal.this, OfertasPublicadas.class);
        startActivity(intent);
    }*/

    //NO HAY PAGINA DE FAVORITOS(CREO QUE SE PERDIO EN GIT)
    /*public void favorites(View view){
        Intent intent=new Intent(MenuTemporal.this, Favoritos.class);
        startActivity(intent);
    }

     */
}