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

public class EstudianteAdapter extends ArrayAdapter {
    private List estudiantes;
    private Context context;
    private int resource;
    public EstudianteAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.estudiantes=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(this.context).inflate(this.resource,parent,false);
        TextView etNombreEstudiante=(TextView) convertView.findViewById(R.id.tvNombreEstudiante);
        return convertView;
    }
}
