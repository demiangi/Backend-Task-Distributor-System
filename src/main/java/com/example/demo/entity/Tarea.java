package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tareas")
    public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String asignadoA;
    private String tipo; // "H" para tareas para hombres, "M" para tareas para mujeres

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public Tarea(String nombre, String asignadoA, String tipo) {
        this.nombre = nombre;
        this.asignadoA = asignadoA;
        this.tipo = tipo;
    }
}