package com.constructora.entity;

import java.math.BigDecimal;

import com.constructora.enums.EstadoProyecto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table 
@Getter
@Setter 
@NoArgsConstructor 
@AllArgsConstructor


public class Proyecto 
{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (nullable = false)
    private String nombre;

    @Column (nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Column (nullable = false)
    private String ciudad;

    private String direccion;

    @Column (nullable = false)
    private BigDecimal precioDesde;

    private String imagenUrl;

    @Enumerated(EnumType.STRING)
    @Column (nullable = false)
    private EstadoProyecto estado;


    private Boolean destacado = false;




}
