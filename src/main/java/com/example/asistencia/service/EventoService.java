package com.example.asistencia.service;

import com.example.asistencia.entity.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoService {
    public List<Evento> list();

    public Evento save(Evento evento);

    public Evento update(Evento evento);

    public Optional<Evento> listById(Integer id);

    public void deleteById(Integer id);

    public List<Evento> findByEscuelaProfesionalIdAndEstadoTrue(Integer id);
}
