package com.example.asistencia.Repository;

import com.example.asistencia.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
    List<Evento> findByEscuelaProfesionalIdAndEstadoTrue(Integer id);
}
