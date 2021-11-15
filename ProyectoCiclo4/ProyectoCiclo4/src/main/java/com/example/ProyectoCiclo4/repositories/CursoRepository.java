package com.example.ProyectoCiclo4.repositories;

import com.example.ProyectoCiclo4.models.CursoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CursoRepository extends MongoRepository<CursoModel,String>{
    
}
