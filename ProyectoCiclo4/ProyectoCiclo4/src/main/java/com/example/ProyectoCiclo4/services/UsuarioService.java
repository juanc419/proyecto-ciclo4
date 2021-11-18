package com.example.ProyectoCiclo4.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoCiclo4.models.UsuarioModel;
import com.example.ProyectoCiclo4.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired 
    UsuarioRepository usuarioRepository;

    //Metodo para guardar usuarios
    public void guardar(UsuarioModel usuario){
        this.usuarioRepository.save(usuario);
    }

    //Metodo para traer los usuarios
    public List<UsuarioModel> traerUsuarios(){
        return this.usuarioRepository.findAll();
    }

    //Metodo para buscar usuario por ID
    public Optional<UsuarioModel> buscarPorId(String id){
        return this.usuarioRepository.findById(id);
    }

    //Metodo para buscar usuario por USENAME
    public UsuarioModel buscarPorusername(String username){
        return this.usuarioRepository.findByUsername(username).orElse(new UsuarioModel());
    } 
    

}

