package com.example.ProyectoCiclo4.services;

import java.util.List;
import java.util.Optional;

import com.example.ProyectoCiclo4.models.CursoModel;
import com.example.ProyectoCiclo4.repositories.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Definimos la clase como un servicio
public class CursoService {

     @Autowired // Creamos la instancia del repository
     CursoRepository cursoRepository;

     //Metodo para guardar cursos
     public void guardarCursos(CursoModel curso){
         this.cursoRepository.save(curso);
     }

     //Metodo para traer los cursos
     public List<CursoModel> traerCursos(){
         return this.cursoRepository.findAll();
     }

     //Metodo para buscar curso por ID
     public Optional<CursoModel> buscarPorId(String id){
         return this.cursoRepository.findById(id);
     }
     
     //Metodo para verificar si ya existe un curso
     public Boolean verificar(String id){
         return this.cursoRepository.existsById(id);
     }

     //Metodo para eliminar un equipo
     public void eliminar(String id){
         this.cursoRepository.deleteById(id);
     }

}
