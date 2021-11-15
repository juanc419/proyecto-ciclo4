package com.example.ProyectoCiclo4.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="materias")
public class MateriaModel {
    
@Id
private String id;
private String nombre;
private boolean isActive = true;

public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public boolean isActive() {
    return isActive;
}
public void setActive(boolean isActive) {
    this.isActive = isActive;
}



}
