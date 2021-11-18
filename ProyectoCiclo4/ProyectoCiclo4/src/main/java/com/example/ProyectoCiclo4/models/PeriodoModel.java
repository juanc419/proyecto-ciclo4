package com.example.ProyectoCiclo4.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="periodos")
public class PeriodoModel {

    @Id
    private String id;
    private int numeroPeriodo;
    private UsuarioModel usuario;
    private MateriaModel materia;
    private String fecha;
    private NotaModel nota;
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public int getNumeroPeriodo() {
        return numeroPeriodo;
    }
    public void setNumeroPeriodo(int numeroPeriodo) {
        this.numeroPeriodo = numeroPeriodo;
    }
    public UsuarioModel getUsuario() {
        return usuario;
    }
    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
    public MateriaModel getMateria() {
        return materia;
    }
    public void setMateria(MateriaModel materia) {
        this.materia = materia;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public NotaModel getNota() {
        return nota;
    }
    public void setNota(NotaModel nota) {
        this.nota = nota;
    }

    
}
