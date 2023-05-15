package com.example.asistencia.Repository;

import com.example.asistencia.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    public List<Persona> findByCicloAndGrupoAndEscuelaProfesionalIdAndEstadoTrue(String ciclo, String grupo, Integer escuelaProfesionalId);
}
