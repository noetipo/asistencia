package com.example.asistencia.service;

import com.example.asistencia.dto.CicloDto;
import com.example.asistencia.dto.GrupoDto;

import java.util.List;

public interface GrupoService {
    public List<GrupoDto> list(Integer idEscuelaProfesional, String ciclo);

}
