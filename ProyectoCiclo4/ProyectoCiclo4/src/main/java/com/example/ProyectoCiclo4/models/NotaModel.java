package com.example.ProyectoCiclo4.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="notas")
public class NotaModel {
    
@Id
private String id;
private float value;
private boolean isActive = true;

public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public float getValue() {
    return value;
}
public void setValue(float value) {
    this.value = value;
}
public boolean isActive() {
    return isActive;
}
public void setActive(boolean isActive) {
    this.isActive = isActive;
}





}

    

