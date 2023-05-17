package com.example.asistencia.Repository;

import com.example.asistencia.entity.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer> {
    public Optional<Asistencia> findByEventoDetalleIdAndMatriculaId(Integer eventoDetalleId, Integer matriculaId);
}
