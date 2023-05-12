package com.example.asistencia.controller;

import com.example.asistencia.entity.Asistencia;
import com.example.asistencia.entity.Asistencia;
import com.example.asistencia.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaController {
    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping()
    public ResponseEntity<List<Asistencia>> list() {
        return ResponseEntity.ok().body(asistenciaService.list());
    }
    @PostMapping()
    public ResponseEntity<Asistencia> save(@RequestBody Asistencia asistencia) {
        return ResponseEntity.ok(asistenciaService.save(asistencia));
    }

    @PutMapping()
    public ResponseEntity<Asistencia> update(@RequestBody Asistencia asistencia) {
        return ResponseEntity.ok(asistenciaService.update(asistencia));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(asistenciaService.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        asistenciaService.deleteById(id);
        return "Deleted Successfully";
    }
}
