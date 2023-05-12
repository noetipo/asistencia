package com.example.asistencia.Repository;

import com.example.asistencia.entity.EscuelaProfesional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EscuelaProfesionalRepository extends JpaRepository<EscuelaProfesional, Integer> {
   public List<EscuelaProfesional> findByFacultadId(Integer id);
}
