package com.example.asistencia.service;

import com.example.asistencia.entity.Periodo;

import java.util.List;
import java.util.Optional;

public interface PeriodoService {
    public List<Periodo> list();

    public Periodo save(Periodo periodo);

    public Periodo update(Periodo periodo);

    public Optional<Periodo> listById(Integer id);

    public void deleteById(Integer id);
}
