package com.cam.listagrupo;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class GrupoEstudiante {

    @Embedded
    private Grupo grupo;

    @Relation(parentColumn = "idGrupo", entityColumn = "idGrupo")
    private List<Estudiante> estudianteList;

    public GrupoEstudiante() {
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }
}
