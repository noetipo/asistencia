package com.example.asistencia.controller;

import com.example.asistencia.dto.AsistenciaDto;
import com.example.asistencia.dto.Mensaje;
import com.example.asistencia.entity.Asistencia;
import com.example.asistencia.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/reporte")
    public ResponseEntity<List<AsistenciaDto>> list(@RequestParam Integer eventoId,
                                                    @RequestParam String actividadId) {
        return ResponseEntity.ok().body(asistenciaService.listAsistencia(actividadId));
    }
    @GetMapping("/registro")
    public ResponseEntity<Optional<Mensaje>> saveAttendance(@RequestParam Integer eventoDetalleId, @RequestParam  Integer eventoId, @RequestParam String dni) {
        return ResponseEntity.ok().body(asistenciaService.registrarAsistencia(eventoDetalleId, eventoId, dni));
    }

}
