package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.InstitucionRepository;
import com.example.asistencia.entity.Institucion;
import com.example.asistencia.service.InstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InstitucionServiceImpl implements InstitucionService {
    @Autowired
    private InstitucionRepository institucionRepository;
    @Override
    public List<Institucion> list() {
        return institucionRepository.findAll();
    }

    @Override
    public Institucion save(Institucion institucion) {
        return institucionRepository.save(institucion);
    }

    @Override
    public Institucion update(Institucion institucion) {
        return institucionRepository.save(institucion);
    }

    @Override
    public Optional<Institucion> listById(Integer id) {
        return institucionRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        institucionRepository.deleteById(id);
    }
}
