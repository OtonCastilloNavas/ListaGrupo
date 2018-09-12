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
}
