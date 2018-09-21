package com.cam.listagrupo;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainEstudianteActivity extends AppCompatActivity {

    //private List<GrupoEstudiante> grupoEstudianteList = new ArrayList<>();
    private GrupoEstudiante grupoEstudiante;
    private ListView lvEstudiante;
    private AppDB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_estudiante);
        int i=getIntent().getIntExtra("idgrupo",-1);
        db= Room.databaseBuilder(this,AppDB.class,"db")
                .allowMainThreadQueries()
                .build();
//        grupoEstudianteList.add(
//                db.grupoDao().obtenerGEPorId(i)
//        );
        grupoEstudiante=db.grupoDao().obtenerGEPorId(i);

        EditText etGrupo = (EditText) findViewById(R.id.tvNombreGrupo);
        etGrupo.setText(grupoEstudiante.getGrupo().getNombreGrupo());
        lvEstudiante=(ListView) findViewById(R.id.lvEstudiante);
        EstudianteAdapter adapter =
                new EstudianteAdapter(
                        this,R.layout.layout_item_estudiante,
                        grupoEstudiante.getEstudianteList());
        lvEstudiante.setAdapter(adapter);


    }

    public void onClick(View view)
    {
        EditText etNombre=(EditText) findViewById(R.id.etNombreEstudiante);
        Estudiante estudiante = new Estudiante();
        estudiante.setNombreEstudiante(etNombre.getText().toString());
        estudiante.setIdGrupo(grupoEstudiante.getGrupo().getIdGrupo());
        db.estudianteDao().insertar(estudiante);
        //grupoEstudiante.getEstudianteList().add(estudiante);
        grupoEstudiante=
                db.grupoDao().obtenerGEPorId(
                        grupoEstudiante.getGrupo().getIdGrupo());
        EstudianteAdapter e= (EstudianteAdapter) lvEstudiante.getAdapter();
        e.notifyDataSetChanged();

    }
}




