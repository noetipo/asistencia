package com.example.asistencia.controller;

import com.example.asistencia.dto.PersonaDto;
import com.example.asistencia.entity.Persona;
import com.example.asistencia.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")

public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping()
    public ResponseEntity<List<Persona>> list() {
        return ResponseEntity.ok().body(personaService.list());
    }

    @PostMapping()
    public ResponseEntity<Persona> save(@RequestBody PersonaDto
                                                personaDto) {
        return ResponseEntity.ok(personaService.save(personaDto));
    }

    @PutMapping()
    public ResponseEntity<Persona> update(@RequestBody PersonaDto
                                                  personaDto) {
        return ResponseEntity.ok(personaService.update(personaDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(personaService.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        personaService.deleteById(id);
        return "Deleted Successfully";
    }

    @GetMapping("/matricula")
    public ResponseEntity<List<Persona>> findByCicloAndGrupoAndEscuelaProfesionalIdAndEstadoTrue(@RequestParam String ciclo,
                                                                                                   @RequestParam String grupo,
                                                                                                   @RequestParam Integer escuelaProfesionalId) {
        return ResponseEntity.ok().body(personaService.findByCicloAndGrupoAndEscuelaProfesionalIdAndEstadoTrue(ciclo, grupo, escuelaProfesionalId));
    }

}
