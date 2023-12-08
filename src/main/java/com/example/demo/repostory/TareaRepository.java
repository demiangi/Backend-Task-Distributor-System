package com.example.demo.repostory;

import com.example.demo.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository <Tarea, Long> {
}
