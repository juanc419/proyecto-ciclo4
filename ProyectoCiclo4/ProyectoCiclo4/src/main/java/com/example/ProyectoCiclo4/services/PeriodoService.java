package com.example.ProyectoCiclo4.services;

import java.util.List;

import com.example.ProyectoCiclo4.models.PeriodoModel;
import com.example.ProyectoCiclo4.repositories.PeriodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Definimos la clase como un servicio
public class PeriodoService {

     @Autowired // Creamos la instancia del repository
     PeriodoRepository periodoRepository;

     //Metodo para guardar cursos
     public void guardarPeriodo(PeriodoModel periodo){
         this.periodoRepository.save(periodo);
     }

     //Metodo para traer los cursos
     public List<PeriodoModel> traerPeriodos(){
         return this.periodoRepository.findAll();
     }

     //Metodo para buscar periodo por ID
     public PeriodoModel getPeriodo(String id){
         return this.periodoRepository.findById(id).orElse(new PeriodoModel());
     }
     
    

}
