package com.cam.listagrupo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainEstudianteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_estudiante);
    }

    public void onClick(View view)
    {
        EditText etNombre=(EditText) findViewById(R.id.etNombreEstudiante);

    }
}
