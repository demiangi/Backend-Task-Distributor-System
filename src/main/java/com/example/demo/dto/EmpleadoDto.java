package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
public class EmpleadoDto {

    private Long id;


    @NotNull(message = "El nombre es obligatorio")
    private String nombre;

    @NotNull(message = "El apellido es obligatorio")
    private String apellido;

    @NotNull(message = "El sexo es obligatorio")
    private String sexo;

    @NotNull(message = "El sector es obligatorio")
    private String sector;

    @NotNull(message = "Los días laborales son obligatorios")
    private String diasLaborales;

    public String obtenerMensajesValidacion(){
        StringBuilder mensajes = new StringBuilder();
        agregarMensajeSiNulo(mensajes, nombre, "El nombre es obligatorio");
        agregarMensajeSiNulo(mensajes, apellido, "El apellido es obligatorio");
        agregarMensajeSiNulo(mensajes, sexo, "El sexo es obligatorio");
        agregarMensajeSiNulo(mensajes, sector, "El sector es obligatorio");
        agregarMensajeSiNulo(mensajes, diasLaborales, "Los dias laborables son obligatorio");

        return mensajes.toString();}

    private void agregarMensajeSiNulo(StringBuilder mensajes, String valor, String mensaje){
        if (valor == null){
            mensajes.append(mensaje);
        }

    }
}
