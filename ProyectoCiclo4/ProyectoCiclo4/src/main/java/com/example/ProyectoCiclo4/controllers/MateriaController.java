package com.example.ProyectoCiclo4.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.example.ProyectoCiclo4.models.MateriaModel;
import com.example.ProyectoCiclo4.services.MateriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MateriaController {


    @Autowired // Instancia del servicio
     MateriaService materiaService;

     /*Definimos el metodo HTTP (POST) por el que se va a ejecutar el metodo
     dentro del controller
     */

     
     @PostMapping("/materias")
     public ResponseEntity<Map<String, String>> guardarMateria(@Valid @RequestBody MateriaModel materia){
        this.materiaService.guardarMaterias(materia);
        //Mostrar un mensaje persnolizado al cliente
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje","Se añadio correctamente");
        respuesta.put("estado","true");
        /*
        {
            "mensaje":"Se añadio correctamente",
            "estado":"true" 
        }
        */
        return ResponseEntity.ok(respuesta);
    }


@GetMapping("/materias") //GET
public List<MateriaModel> traerMaterias(){
    return this.materiaService.traerMaterias();
}

@GetMapping("/materias{id}") //GET
public MateriaModel traerMateriasPorId(@PathVariable String id){
    return this.materiaService.buscarPorId(id).get();
}


}
