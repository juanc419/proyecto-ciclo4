package com.example.ProyectoCiclo4.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoCiclo4.models.UsuarioModel;
import com.example.ProyectoCiclo4.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired // Creamos la instancia del repository
    UsuarioRepository usuarioRepository;

    //Metodo para guardar usuarios
    public void guardarUsuarios(UsuarioModel usuario){
        this.usuarioRepository.save(usuario);
    }

    //Metodo para traer los usuarios
    public List<UsuarioModel> traerUsuarios(){
        return this.usuarioRepository.findAll();
    }

    //Metodo para buscar equipo por ID
    public Optional<UsuarioModel> buscarPorId(String id){
        return this.usuarioRepository.findById(id);
    }
    
    //Metodo para verificar si ya existe un usuario
    public Boolean verificar(String id){
        return this.usuarioRepository.existsById(id);
    }

    //Metodo para eliminar un usuario
    public void eliminar(String id){
        this.usuarioRepository.deleteById(id);
    }

}

