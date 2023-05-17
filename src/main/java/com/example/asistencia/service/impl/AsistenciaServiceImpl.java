package com.example.asistencia.service.impl;

import com.example.asistencia.Repository.AsistenciaListarRepository;
import com.example.asistencia.Repository.AsistenciaRepository;
import com.example.asistencia.Repository.MatriculaRepository;
import com.example.asistencia.dto.AsistenciaDto;
import com.example.asistencia.dto.Mensaje;
import com.example.asistencia.entity.Asistencia;
import com.example.asistencia.entity.EventoDetalle;
import com.example.asistencia.entity.Matricula;
import com.example.asistencia.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {
    @Autowired
    private AsistenciaRepository asistenciaRepository;
    @Autowired
    private AsistenciaListarRepository asistenciaListarRepository;

    @Autowired
    private MatriculaRepository matriculaRepository;

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

    @Override
    public List<AsistenciaDto> listAsistencia(String id) {
        return asistenciaListarRepository.listAsistencia(id);
    }

    @Override
    public Optional<Mensaje> registrarAsistencia(Integer eventoDetalleId, Integer eventoId, String dni) {
        Optional<Matricula> matricula = matriculaRepository.findByPersonaDniOrPersonaCodigo(dni, dni);
        Optional<Asistencia> asistencia = asistenciaRepository.findByEventoDetalleIdAndMatriculaId(eventoDetalleId, matricula.get().getId());
        if (asistencia.isPresent()) {
            asistencia.get().setFechaSalida(new Date());
            asistenciaRepository.save(asistencia.get());
        } else {
            Asistencia asistenciaGuardar = new Asistencia();
            asistenciaGuardar.setFechaEntrada(new Date());
            asistenciaGuardar.setMatricula(matricula.get());
            EventoDetalle eventoDetalle = new EventoDetalle();
            eventoDetalle.setId(eventoDetalleId);
            asistenciaGuardar.setEventoDetalle(eventoDetalle);
            asistenciaRepository.save(asistenciaGuardar);
        }
        return Optional.of(new Mensaje("Se Registro Asistencia de: " + matricula.get().getPersona().getNombres()));
    }
}
