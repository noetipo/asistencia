package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.GrupoRepository;
import com.example.asistencia.dto.GrupoDto;
import com.example.asistencia.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoServiceImpl implements GrupoService {
    @Autowired
    private GrupoRepository grupoRepository;

    @Override
    public List<GrupoDto> list(Integer idEscuelaProfesional, String ciclo) {
        return grupoRepository.listGroup(idEscuelaProfesional, ciclo);
    }
}
