package com.example.asistencia.Repository;

import com.example.asistencia.entity.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultadRepository extends JpaRepository<Facultad, Integer> {
    public List<Facultad> findByFilialId(Integer id);
}
