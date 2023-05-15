package com.example.asistencia.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AsistenciaDto {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "ciclo")
    private String ciclo;
    @Column(name = "grupo")
    private String grupo;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "fecha_entrada")
    private String fecha_entrada;
    @Column(name = "fecha_salida")
    private String fecha_salida;
}
