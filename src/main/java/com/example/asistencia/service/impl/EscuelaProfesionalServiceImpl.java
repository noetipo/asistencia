package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.EscuelaProfesionalRepository;
import com.example.asistencia.entity.EscuelaProfesional;
import com.example.asistencia.service.EscuelaProfesionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscuelaProfesionalServiceImpl implements EscuelaProfesionalService {
    @Autowired
    private EscuelaProfesionalRepository escuelaProfesionalRepository;

    @Override
    public List<EscuelaProfesional> list() {
        return escuelaProfesionalRepository.findAll();
    }

    @Override
    public EscuelaProfesional save(EscuelaProfesional escuelaProfesional) {
        return escuelaProfesionalRepository.save(escuelaProfesional);
    }

    @Override
    public EscuelaProfesional update(EscuelaProfesional escuelaProfesional) {
        return escuelaProfesionalRepository.save(escuelaProfesional);
    }

    @Override
    public Optional<EscuelaProfesional> listById(Integer id) {
        return escuelaProfesionalRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        escuelaProfesionalRepository.deleteById(id);

    }

    @Override
    public List<EscuelaProfesional> findByFacultadId(Integer id) {
        return escuelaProfesionalRepository.findByFacultadId(id);
    }
}
