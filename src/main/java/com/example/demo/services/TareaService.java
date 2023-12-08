package com.example.demo.services;

import com.example.demo.entity.Tarea;
import com.example.demo.repostory.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    @Autowired
    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> obtenerTodas() {
        return tareaRepository.findAll();
    }

    public Tarea crearTarea(Tarea tarea) {
        // Puedes agregar lógica adicional aquí antes de guardar la tarea
        return tareaRepository.save(tarea);
    }

}
