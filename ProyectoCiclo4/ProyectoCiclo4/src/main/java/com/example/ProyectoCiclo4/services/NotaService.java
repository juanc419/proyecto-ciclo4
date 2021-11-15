package com.example.ProyectoCiclo4.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoCiclo4.models.NotaModel;
import com.example.ProyectoCiclo4.repositories.NotaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService {

    @Autowired // Creamos la instancia del repository
    NotaRepository notaRepository;

    //Metodo para guardar notas
    public void guardarNotas(NotaModel nota){
        this.notaRepository.save(nota);
    }

    //Metodo para traer las notas
    public List<NotaModel> traerNotas(){
        return this.notaRepository.findAll();
    }

    //Metodo para buscar nota por ID
    public Optional<NotaModel> buscarPorId(String id){
        return this.notaRepository.findById(id);
    }
    
    //Metodo para verificar si ya existe una nota
    public Boolean verificar(String id){
        return this.notaRepository.existsById(id);
    }

    //Metodo para eliminar una nota
    public void eliminar(String id){
        this.notaRepository.deleteById(id);
    }
   



}

