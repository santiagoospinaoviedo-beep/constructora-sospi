package com.constructora.dto;

import java.math.BigDecimal;

import com.constructora.enums.TipoVivienda;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class ViviendaRequestDTO {

    @NotBlank (message = "El titulo es obligatorio")
    private String titulo;

    @NotNull(message = "El tipo es obligatorio")
    private TipoVivienda tipo;

    @NotNull(message = "Las habitaciones son obligatorias")
    @Min(value = 0, message = "Las habitaciones deben ser cero o mayor")
    private Integer habitaciones;

    @NotNull(message = "Los baños son obligatorios")
    @Min(value = 1, message = "Los baños deben ser uno o mayor")
    private Integer banos;
 
    @NotNull(message = "El area es obligatoria")
    @DecimalMin(value = "0.01", message = "El area debe ser mayor que cero")
    private Double area;    

    @NotNull(message = "El precio es obligatoria")
    @DecimalMin(value = "0.01", message = "El precio debe ser mayor que cero")
    private BigDecimal precio;    

    private String imagenUrl;

    private Boolean disponible;

    @NotNull (message = "El proyecto es obligatorio")
    private Long proyectoId;
    

}
