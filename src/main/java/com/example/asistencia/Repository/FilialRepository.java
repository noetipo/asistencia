package com.example.asistencia.Repository;

import com.example.asistencia.entity.Filial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilialRepository extends JpaRepository<Filial, Integer> {

   public List<Filial> findByInstitucionId(Integer id);
}
