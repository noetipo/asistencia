package com.example.asistencia.service;

import com.example.asistencia.entity.EscuelaProfesional;

import java.util.List;
import java.util.Optional;

public interface EscuelaProfesionalService {
    public List<EscuelaProfesional> list();

    public EscuelaProfesional save(EscuelaProfesional escuelaProfesional);

    public EscuelaProfesional update(EscuelaProfesional escuelaProfesional);

    public Optional<EscuelaProfesional> listById(Integer id);

    public void deleteById(Integer id);
    public List<EscuelaProfesional> findByFacultadId(Integer id);
}
