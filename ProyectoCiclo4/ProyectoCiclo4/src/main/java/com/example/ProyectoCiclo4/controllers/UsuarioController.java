package com.example.ProyectoCiclo4.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import com.example.ProyectoCiclo4.models.UsuarioModel;
import com.example.ProyectoCiclo4.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class UsuarioController {

    @Autowired // Instancia del servicio
    UsuarioService usuarioService;

    
    @PostMapping("/usuarios")
    public ResponseEntity<Map<String, String>> guardarUsuario(@Valid @RequestBody UsuarioModel usuario){
       

       Map<String, String> respuesta = new HashMap<>();
      

       UsuarioModel u = this.usuarioService.buscarPorusername(usuario.getUsername());
       if(u.getId()==null){
          this.usuarioService.guardarUsuarios(usuario);
          respuesta.put("mensaje", "Se agrego correctamente");
       
       }else{
          respuesta.put("mensaje","El usuario ya existe");
       }
       
       return ResponseEntity.ok(respuesta);
   
   }




}

    

