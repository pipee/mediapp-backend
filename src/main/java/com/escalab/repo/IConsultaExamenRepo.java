package com.escalab.repo;

import com.escalab.model.ConsultaExamen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface IConsultaExamenRepo extends JpaRepository<ConsultaExamen, Integer> {

//    @Transactional
    @Modifying
    @Query(value = "INSERT INTO consulta_examen(id_consulta, id_examen) VALUES (:idConsulta, :idExamen)", nativeQuery = true)
    Integer registrar(@Param("idConsulta") Integer idConsulta, @Param("idExamen") Integer idExamen);

    @Query("from ConsultaExamen ce where ce.consulta.idConsulta = :idConsulta")
    List<ConsultaExamen> listarExamenesPorConsulta(@Param("idConsulta") Integer idConsulta);
}
