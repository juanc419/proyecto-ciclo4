package com.example.ProyectoCiclo4.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.example.ProyectoCiclo4.models.CursoModel;
import com.example.ProyectoCiclo4.services.CursoService;

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
public class CursoController {
    

@Autowired // Instancia del servicio
CursoService cursoService;

/*Definimos el metodo HTTP (POST) por el que se va a ejecutar el metodo
dentro del controller
*/


@PostMapping("/cursos")
public ResponseEntity<Map<String, String>> guardarCurso(@Valid @RequestBody CursoModel curso){
   this.cursoService.guardarCursos(curso);
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


@GetMapping("/cursos") //GET
public List<CursoModel> traerCursos(){
return this.cursoService.traerCursos();
}

@GetMapping("/cursos{id}") //GET
public CursoModel traerCursosPorId(@PathVariable String id){
return this.cursoService.buscarPorId(id).get();
}


}
