package com.cam.listagrupo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GrupoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo);
    }

    public void onClick(View view)
    {
        EditText etNombre=(EditText) findViewById(R.id.etNombre);
        Intent intent = new Intent();
        Grupo grupo = new Grupo();
        grupo.setNombreGrupo(etNombre.getText().toString());
        intent.putExtra("grupo",grupo);
        setResult(RESULT_OK,intent);
        finish();
    }
}
