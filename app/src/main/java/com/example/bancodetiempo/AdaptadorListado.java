package com.example.bancodetiempo;

import java.util.List;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class AdaptadorListado extends RecyclerView.Adapter<AdaptadorListado.ViewHolder> {
    private List<ElementoListado>mData;
    private LayoutInflater mInflater;
    private Context context;

    public AdaptadorListado(List<ElementoListado> itemList, Context context){
        this.mInflater=LayoutInflater.from(context);
        this.context=context;
        this.mData=itemList;
    }

    @Override
    public int getItemCount(){
        return mData.size();
    }

    @Override
    public AdaptadorListado.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view=mInflater.inflate(R.layout.elemento_listado, null);
        return new AdaptadorListado.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AdaptadorListado.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ElementoListado> items){
        mData=items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView jobs, work;
        TextView nombre, trabajo;

        ViewHolder(View itemView){
            super(itemView);
            jobs=itemView.findViewById(R.id.imagenUsuario);
            work=itemView.findViewById(R.id.imagen);
            nombre=itemView.findViewById(R.id.nombreTextView);
            trabajo=itemView.findViewById(R.id.trabajoTextView);

        }

        void bindData(final ElementoListado item){
            work.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombre.setText(item.getNombre());
            trabajo.setText(item.getTrabajo());
        }
    }
}
