package com.example.asistencia.Repository;

import com.example.asistencia.entity.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsistenciaRepository extends JpaRepository<Asistencia,Integer> {
}
