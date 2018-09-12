package com.cam.listagrupo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView lvGrupo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGrupo=(ListView) findViewById(R.id.lvGrupo);
        //GrupoAdapter adapter = new GrupoAdapter(this,R.layout.layout_item_grupo,);
        //lvGrupo.setAdapter(adapter);
        registerForContextMenu(lvGrupo);
        lvGrupo.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("agregar");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add("Editar");
        menu.add("Eliminar");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        if(item.getTitle().equals("Editar"))
        {
            //Intent intent = new Intent(this);
            //startActivityForResult(intent,123);
        }
        else
        {
            //borrar
        }
        actualizarListView();
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==RESULT_OK)
        {
            if(requestCode==312) {
                //agregar
                //data.getExtras().get("grupo");
            }
            else if(requestCode==123)
            {
                //editar
            }
            actualizarListView();

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void actualizarListView()
    {
        ((GrupoAdapter)lvGrupo.getAdapter()).notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {

    }
}
