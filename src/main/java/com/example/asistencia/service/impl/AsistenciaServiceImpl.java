package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.AsistenciaRepository;
import com.example.asistencia.entity.Asistencia;
import com.example.asistencia.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {
    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @Override
    public List<Asistencia> list() {
        return asistenciaRepository.findAll();
    }
    @Override
    public Asistencia save(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Asistencia update(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Optional<Asistencia> listById(Integer id) {
        return asistenciaRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        asistenciaRepository.deleteById(id);
    }
}
