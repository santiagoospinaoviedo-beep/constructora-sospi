package com.constructora.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter 
@Setter 
public class ClienteInteresadoResponseDTO 
{
    private Long id;
    private String nombre;
    private String telefono;
    private String correo;
    private String mensaje;
    private LocalDateTime fechaRegistro;
    private Long proyectoId;
    private String proyectoNombre;
}
