package com.example.asistencia.service;

import com.example.asistencia.entity.Institucion;

import java.util.List;
import java.util.Optional;

public interface InstitucionService {
    public List<Institucion> list();

    public Institucion save(Institucion institucion);

    public Institucion update(Institucion institucion);

    public Optional<Institucion> listById(Integer id);

    public void deleteById(Integer id);
}
