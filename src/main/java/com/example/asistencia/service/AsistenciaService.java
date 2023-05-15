package com.example.asistencia.service;

import com.example.asistencia.dto.AsistenciaDto;
import com.example.asistencia.entity.Asistencia;

import java.util.List;
import java.util.Optional;

public interface AsistenciaService {
    public List<Asistencia> list();

    public Asistencia save(Asistencia asistencia);

    public Asistencia update(Asistencia asistencia);

    public Optional<Asistencia> listById(Integer id);

    public void deleteById(Integer id);

    public List<AsistenciaDto> listAsistencia(String id);
}
