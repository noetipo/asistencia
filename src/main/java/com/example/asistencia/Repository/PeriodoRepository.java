package com.example.asistencia.Repository;

import com.example.asistencia.entity.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PeriodoRepository extends JpaRepository<Periodo, Integer> {
    Optional<Periodo> findByEstadoTrue();
}
