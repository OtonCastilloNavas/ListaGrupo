package com.cam.listagrupo;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(
        entity = Grupo.class,
        parentColumns = "idGrupo",
        childColumns = "idGrupo", onDelete = CASCADE,
        onUpdate = CASCADE))
public class Estudiante {
    @PrimaryKey
    private int idEstudiante;
    private String  nombreEstudiante;
    private int idGrupo;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombreEstudiante, int idGrupo) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.idGrupo = idGrupo;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
}
