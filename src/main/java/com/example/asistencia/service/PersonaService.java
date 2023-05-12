package com.example.asistencia.service;

import com.example.asistencia.dto.PersonaDto;
import com.example.asistencia.entity.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    public List<Persona> list();

    public Persona save(PersonaDto personaDto);

    public Persona update(PersonaDto personaDto);

    public Optional<Persona> listById(Integer id);

    public void deleteById(Integer id);
}
