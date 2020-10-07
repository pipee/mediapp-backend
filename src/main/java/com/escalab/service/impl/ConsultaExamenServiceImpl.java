package com.escalab.service.impl;

import com.escalab.model.ConsultaExamen;
import com.escalab.repo.IConsultaExamenRepo;
import com.escalab.service.IConsultaExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaExamenServiceImpl implements IConsultaExamenService {

    @Autowired
    private IConsultaExamenRepo repo;

    @Override
    public List<ConsultaExamen> listarExamenesPorConsulta(Integer idConsulta) {
        return repo.listarExamenesPorConsulta(idConsulta);
    }
}
