package com.example.ProyectoCiclo4.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.ProyectoCiclo4.models.PeriodoModel;
import com.example.ProyectoCiclo4.services.PeriodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PeriodoController {
    

@Autowired // Instancia del servicio
PeriodoService periodoService;

/*Definimos el metodo HTTP (POST) por el que se va a ejecutar el metodo
dentro del controller
*/


@PostMapping("/periodos")
public ResponseEntity<Map<String, String>> guardar(@RequestBody PeriodoModel periodo){
   this.periodoService.guardarPeriodo(periodo);
   //Mostrar un mensaje persnolizado al cliente
   Map<String, String> respuesta = new HashMap<>();
   respuesta.put("mensaje","Se añadio correctamente");

  
   return ResponseEntity.ok(respuesta);
}


@GetMapping("/periodos") //GET
public List<PeriodoModel> traerPeriodos(){
return this.periodoService.traerPeriodos();
}

//Metodo para actualizar un periodo
@PutMapping("/periodos") //GET
public ResponseEntity<Map<String, String>> actualizar(@RequestBody PeriodoModel periodo){
   this.periodoService.guardarPeriodo(periodo);

   Map<String, String> respuesta = new HashMap<>();
   respuesta.put("mensaje","Se actualizó correctamente");

   return ResponseEntity.ok(respuesta);
}


}
