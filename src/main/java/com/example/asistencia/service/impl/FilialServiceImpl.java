package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.FilialRepository;
import com.example.asistencia.entity.Filial;
import com.example.asistencia.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilialServiceImpl implements FilialService {
    @Autowired
    private FilialRepository filialRepository;

    @Override
    public List<Filial> list() {
        return filialRepository.findAll();
    }

    @Override
    public Filial save(Filial filial) {
        return filialRepository.save(filial);
    }

    @Override
    public Filial update(Filial filial) {
        return filialRepository.save(filial);
    }

    @Override
    public Optional<Filial> listById(Integer id) {
        return filialRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        filialRepository.deleteById(id);
    }

    @Override
    public List<Filial> findByInstitucionId(Integer id) {
        return filialRepository.findByInstitucionId(id);
    }
}
