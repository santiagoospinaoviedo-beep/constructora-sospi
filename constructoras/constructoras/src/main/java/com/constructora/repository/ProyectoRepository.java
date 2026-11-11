package com.constructora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.constructora.entity.Proyecto;


public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {

    List<Proyecto> findByDestacadoTrue();
}
