package com.example.asistencia.service;

import com.example.asistencia.dto.CicloDto;
import com.example.asistencia.entity.Asistencia;

import java.util.List;
import java.util.Optional;

public interface CicloService {
    public List<CicloDto> list(Integer idEscuelaProfesional);

}
