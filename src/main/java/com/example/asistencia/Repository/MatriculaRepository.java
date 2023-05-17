package com.example.asistencia.Repository;

import com.example.asistencia.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
    public Optional<Matricula> findByPersonaDniOrPersonaCodigo(String dni, String codigo);

}
