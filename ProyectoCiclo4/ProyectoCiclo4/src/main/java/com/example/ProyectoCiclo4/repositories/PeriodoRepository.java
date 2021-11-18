package com.example.ProyectoCiclo4.repositories;

import com.example.ProyectoCiclo4.models.PeriodoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeriodoRepository extends MongoRepository<PeriodoModel,String>{
    
}
