package com.example.ProyectoCiclo4.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoCiclo4.models.MateriaModel;
import com.example.ProyectoCiclo4.repositories.MateriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {

    @Autowired // Creamos la instancia del repository
    MateriaRepository materiaRepository;

    //Metodo para guardar materias
    public void guardarMaterias(MateriaModel materia){
        this.materiaRepository.save(materia);
    }

    //Metodo para traer los materias
    public List<MateriaModel> traerMaterias(){
        return this.materiaRepository.findAll();
    }

    //Metodo para buscar materia por ID
    public Optional<MateriaModel> buscarPorId(String id){
        return this.materiaRepository.findById(id);
    }
    
    //Metodo para verificar si ya existe una materia
    public Boolean verificar(String id){
        return this.materiaRepository.existsById(id);
    }

    //Metodo para eliminar una materia
    public void eliminar(String id){
        this.materiaRepository.deleteById(id);
    }
   



}
