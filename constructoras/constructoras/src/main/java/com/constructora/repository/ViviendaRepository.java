package com.constructora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.constructora.entity.Vivienda;


public interface ViviendaRepository extends JpaRepository<Vivienda, Long> {
    List<Vivienda> findByProyectoId(Long proyectoId);

    List<Vivienda> findByDisponibleTrue();
    
}
