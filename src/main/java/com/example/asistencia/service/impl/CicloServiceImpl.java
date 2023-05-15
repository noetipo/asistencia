package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.CicloRepository;
import com.example.asistencia.dto.CicloDto;
import com.example.asistencia.service.CicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloServiceImpl implements CicloService {
    @Autowired
    private CicloRepository cicloRepository;

    @Override
    public List<CicloDto> list(Integer idEscuelaProfesional) {
        return cicloRepository.listCycle(idEscuelaProfesional);
    }
}
