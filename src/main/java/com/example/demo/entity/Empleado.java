package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String sexo;
    private String sector;
    private String diasLaborales;



    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<Tarea> tareas;

    public Empleado(String nombre, String apellido, String sexo, String sector, String diasLaborales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.sector = sector;
        this.diasLaborales = diasLaborales;

    }
}
