package com.example.asistencia.controller;

import com.example.asistencia.entity.Periodo;
import com.example.asistencia.service.PeriodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periodo")

public class PeriodoController {
    @Autowired
    private PeriodoService periodoService;

    @GetMapping()
    public ResponseEntity<List<Periodo>> list() {
        return ResponseEntity.ok().body(periodoService.list());
    }

    @PostMapping()
    public ResponseEntity<Periodo> save(@RequestBody Periodo periodo) {
        return ResponseEntity.ok(periodoService.save(periodo));
    }

    @PutMapping()
    public ResponseEntity<Periodo> update(@RequestBody Periodo periodo) {
        return ResponseEntity.ok(periodoService.update(periodo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Periodo> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(periodoService.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        periodoService.deleteById(id);
        return "Deleted Successfully";
    }

}
