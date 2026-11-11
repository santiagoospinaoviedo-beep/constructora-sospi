package com.constructora.services;

import com.constructora.dto.ProyectoRequestDTO;
import com.constructora.dto.ProyectoResponseDTO;

import java.util.List;

public interface ProyectoService 
{
    List<ProyectoResponseDTO> obtenerProyectos();

    List<ProyectoResponseDTO> obtenerDestacados();

    ProyectoResponseDTO obtenerPorId(Long id);

    ProyectoResponseDTO crear(ProyectoRequestDTO dto);

    ProyectoResponseDTO actualizar(Long id, ProyectoRequestDTO dto);

    void eliminar(Long id);


}
