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

    public String obtenerMensajesValidacion(){
        StringBuilder mensajes = new StringBuilder();

        agregarMensajeSiNulo(mensajes, nombre,"El nombre de la tarea es obligatorio");
        agregarMensajeSiNulo(mensajes, descripcion, "La descripcion es obligatoria");

        return mensajes.toString();
    }
    private void agregarMensajeSiNulo(StringBuilder mensajes, String valor, String mensaje){
        if (valor == null){
            mensajes.append(mensaje);
        }
    }

}
