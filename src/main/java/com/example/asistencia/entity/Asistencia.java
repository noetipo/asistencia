package com.example.asistencia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "asistencia")
@Data

public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrada;

    @Column(name = "fecha_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evento_detalle_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private EventoDetalle eventoDetalle;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matricula_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Matricula matricula;
}
