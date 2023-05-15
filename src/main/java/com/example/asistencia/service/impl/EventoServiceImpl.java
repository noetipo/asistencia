package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.EventoRepository;
import com.example.asistencia.Repository.PeriodoRepository;
import com.example.asistencia.entity.Evento;
import com.example.asistencia.entity.Periodo;
import com.example.asistencia.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoServiceImpl implements EventoService {
    @Autowired
    private EventoRepository eventoRepository;
    @Autowired
    private PeriodoRepository periodoRepository;

    @Override
    public List<Evento> list() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento save(Evento evento) {
        Optional<Periodo> periodo = periodoRepository.findByEstadoTrue();
        evento.setPeriodo(periodo.get());
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

    @Override
    public List<Evento> findByEscuelaProfesionalIdAndEstadoTrue(Integer id) {
        return eventoRepository.findByEscuelaProfesionalIdAndEstadoTrue(id);
    }
}
