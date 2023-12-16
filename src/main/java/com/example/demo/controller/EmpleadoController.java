package com.example.demo.controller;

import com.example.demo.dto.EmpleadoDto;
import com.example.demo.entity.Empleado;
import com.example.demo.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }


    @GetMapping
    public List<EmpleadoDto> obtenerTodosLosEmpleados() {
        try {
            logger.info("Obteniendo todos los empleados");
            return empleadoService.obtenerTodos();
        }catch (Exception e){
            logger.error("Error al obtener todos los empleados" +e.getMessage(),e);
            throw e;
        }
    }

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.crearEmpleado(empleado);
    }

}
