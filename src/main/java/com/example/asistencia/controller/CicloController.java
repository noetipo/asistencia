package com.example.asistencia.controller;

import com.example.asistencia.dto.CicloDto;
import com.example.asistencia.service.CicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciclo")

public class CicloController {
    @Autowired
    private CicloService cicloService;

    @GetMapping()
    public ResponseEntity<List<CicloDto>> list(@RequestParam Integer idEscuelaProfesional) {
        return ResponseEntity.ok().body(cicloService.list(idEscuelaProfesional));
    }

}
