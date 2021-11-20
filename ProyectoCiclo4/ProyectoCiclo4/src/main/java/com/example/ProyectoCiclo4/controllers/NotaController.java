package com.example.ProyectoCiclo4.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

//import com.example.ProyectoCiclo4.models.NotaModel;
import com.example.ProyectoCiclo4.services.NotaService;

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
public class NotaController {


    @Autowired // Instancia del servicio
     NotaService notaService;

     /*Definimos el metodo HTTP (POST) por el que se va a ejecutar el metodo
     dentro del controller
     */

     
     /*@PostMapping("/notas")
     public ResponseEntity<Map<String, String>> guardarNota(@Valid @RequestBody NotaModel nota){
        this.notaService.guardarNotas(nota);
        //Mostrar un mensaje personalizado al cliente
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje","Se añadio correctamente");
        respuesta.put("estado","true");*/
        /*
        {
            "mensaje":"Se añadio correctamente",
            "estado":"true" 
        }
        *//*
        return ResponseEntity.ok(respuesta);
    }*/


    /*@GetMapping("/notas") //GET
    public List<NotaModel> traerNotas(){
        return this.notaService.traerNotas();
    }

    @GetMapping("/Notas{id}") //GET
    public NotaModel traerNotasPorId(@PathVariable String id){
        return this.notaService.buscarPorId(id).get();
    }*/


}

