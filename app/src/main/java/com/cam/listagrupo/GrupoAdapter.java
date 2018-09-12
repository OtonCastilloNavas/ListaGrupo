package com.cam.listagrupo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class GrupoAdapter extends ArrayAdapter {
   private List grupos;
   private int resource;
   private Context context;
    public GrupoAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.grupos=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(this.context).inflate(this.resource,parent,false);
        TextView tvNombre=(TextView) convertView.findViewById(R.id.tvNombre);
        TextView tvCantidad=(TextView) convertView.findViewById(R.id.tvCantidad);
        //tvNombre.setText();
        //tvCantidad.setText(String.valueOf());
        return convertView;
    }
}
