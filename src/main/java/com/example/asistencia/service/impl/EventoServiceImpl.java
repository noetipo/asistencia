package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.EventoRepository;
import com.example.asistencia.entity.Evento;
import com.example.asistencia.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoServiceImpl implements EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> list() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public Evento update(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public Optional<Evento> listById(Integer id) {
        return eventoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        eventoRepository.deleteById(id);
    }
}
