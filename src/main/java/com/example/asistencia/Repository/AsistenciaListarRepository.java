package com.example.asistencia.Repository;

import com.example.asistencia.dto.AsistenciaDto;
import com.example.asistencia.dto.GrupoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AsistenciaListarRepository extends JpaRepository<AsistenciaDto, String> {
    @Query(value = "select e.nombre,\n" +
            "       p.codigo,\n" +
            "       p.dni,\n" +
            "       p.nombres,\n" +
            "       p.ciclo,\n" +
            "       p.grupo,\n" +
            "       d.fecha,\n" +
            "       p.id,\n" +
            "       (select a.fecha_entrada\n" +
            "        from asistencia a\n" +
            "        where a.fecha_id = ?1 and a.matricula_id = m.id\n" +
            "        limit 1)                                                                                           fecha_entrada,\n" +
            "       (select a.fecha_salida from asistencia a where a.fecha_id = ?1 and a.matricula_id = m.id limit 1) fecha_salida\n" +
            "from matricula m\n" +
            "         left join persona p on p.id = m.persona_id\n" +
            "         left join evento e on e.id = m.evento_id\n" +
            "         left join evento_detalle d on e.id = d.evento_id\n" +
            "WHERE d.id = ?1", nativeQuery = true)
    public List<AsistenciaDto> listAsistencia(String id);
}
