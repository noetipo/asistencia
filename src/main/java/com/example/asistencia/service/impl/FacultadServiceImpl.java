package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.FacultadRepository;
import com.example.asistencia.entity.Facultad;
import com.example.asistencia.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadServiceImpl implements FacultadService {
    @Autowired
    private FacultadRepository facultadRepository;

    @Override
    public List<Facultad> list() {
        return facultadRepository.findAll();
    }

    @Override
    public Facultad save(Facultad facultad) {
        return facultadRepository.save(facultad);
    }

    @Override
    public Facultad update(Facultad facultad) {
        return facultadRepository.save(facultad);
    }

    @Override
    public Optional<Facultad> listById(Integer id) {
        return facultadRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        facultadRepository.deleteById(id);

    }

    @Override
    public List<Facultad> findByFilialId(Integer id) {
        return facultadRepository.findByFilialId(id);
    }
}
