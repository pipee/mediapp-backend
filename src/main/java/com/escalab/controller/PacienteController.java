package com.escalab.controller;

import com.escalab.exception.ModeloNotFoundException;
import com.escalab.model.Paciente;
import com.escalab.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
//@CrossOrigin()
public class PacienteController {

    @Autowired
    private IPacienteService service;

    @GetMapping
    public ResponseEntity<List<Paciente>> listar() {
        List<Paciente> lista = service.listar();
        return new ResponseEntity<List<Paciente>>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> listarPorId(@PathVariable("id") Integer id) {
        Paciente pac = service.leerPorId(id);
        if (pac.getIdPaciente() == null) {
            throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
        }
        return new ResponseEntity<Paciente>(pac, HttpStatus.OK);
    }

    @GetMapping("/pageable")
    public ResponseEntity<Page<Paciente>> listarPageable(Pageable pageable) {
        Page<Paciente> pacientes = service.listarPageable(pageable);
        return new ResponseEntity<Page<Paciente>>(pacientes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> registrar(@Valid @RequestBody Paciente paciente) {
        Paciente pac = service.registrar(paciente);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(paciente.getIdPaciente()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Paciente> modificar(@Valid @RequestBody Paciente paciente) {
        Paciente pac = service.modificar(paciente);
        return new ResponseEntity<Paciente>(pac, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
        Paciente pac = service.leerPorId(id);
        if (pac.getIdPaciente() == null) {
            throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
        }
        service.eliminar(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
