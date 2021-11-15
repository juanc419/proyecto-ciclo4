package com.example.ProyectoCiclo4.repositories;

import com.example.ProyectoCiclo4.models.MateriaModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends MongoRepository<MateriaModel,String>{
    
}
    

