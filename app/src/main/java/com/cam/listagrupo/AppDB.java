package com.cam.listagrupo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(version = 1,entities = {Grupo.class, Estudiante.class})
public abstract class AppDB extends RoomDatabase {
    public abstract GrupoDao grupoDao();
    public abstract EstudianteDao estudianteDao();
}
