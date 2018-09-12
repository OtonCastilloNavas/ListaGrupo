package com.cam.listagrupo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface GrupoDao {

    @Insert
    void insertar(Grupo grupo);

    @Update
    void actualizar(Grupo grupo);

    @Delete
    void borrar(Grupo grupo);

    @Query("SELECT * FROM grupo")
    List<Grupo> obtenerTodo();

    @Query("SELECT * FROM grupo where idGrupo=:id")
    Grupo obtenerPorId(int id);

    @Query("SELECT * FROM grupo where idGrupo=:id")
    GrupoEstudiante obtenerGEPorId(int id);



}
