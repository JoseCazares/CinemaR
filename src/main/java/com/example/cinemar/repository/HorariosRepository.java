package com.example.cinemar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cinemar.model.Horarios;

@Repository
public interface HorariosRepository extends JpaRepository<Horarios,Long>{
    
}
