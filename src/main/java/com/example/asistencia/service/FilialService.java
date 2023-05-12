package com.example.asistencia.service;

import com.example.asistencia.entity.Filial;

import java.util.List;
import java.util.Optional;

public interface FilialService {
    public List<Filial> list();

    public Filial save(Filial filial);

    public Filial update(Filial filial);

    public Optional<Filial> listById(Integer id);

    public void deleteById(Integer id);

    public  List<Filial> findByInstitucionId(Integer id);
}
