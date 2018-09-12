package com.cam.listagrupo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface EstudianteDao {

    @Insert
    void insertar(Estudiante estudiante);

    @Delete
    void borrar(Estudiante estudiante);

    @Update
    void actualizar(Estudiante estudiante);

    @Query("SELECT * FROM estudiante")
    List<Estudiante> obtenerTodo();

}
