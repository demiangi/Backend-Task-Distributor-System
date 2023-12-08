package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor

public class TareaDto {

    private Long id;

    @NotNull(message = "El nombre de la tarea es obligatoria")
    private String nombre;

    @NotNull(message = "La descripcion es obligatoria")
    private String descripcion;

}
