package com.escalab.controller;

import com.escalab.exception.ModeloNotFoundException;
import com.escalab.model.Medico;
import com.escalab.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private IMedicoService service;

    @PreAuthorize("@authServiceImpl.tieneAcceso('listar')")
//    @PreAuthorize("hasAnyAuthority('ADMIN') or hasAnyAuthority('DBA')")
    @GetMapping
    public ResponseEntity<List<Medico>> listar() {
        List<Medico> lista = service.listar();
        return new ResponseEntity<List<Medico>>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> listarPorId(@PathVariable("id") Integer id) {
        Medico obj = service.leerPorId(id);
        if (obj.getIdMedico() == null) {
            throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
        }
        return new ResponseEntity<Medico>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> registrar(@Valid @RequestBody Medico medico){
        Medico obj = service.registrar(medico);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(medico.getIdMedico()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Medico> modificar(@Valid @RequestBody Medico medico){
        Medico obj = service.modificar(medico);
        return new ResponseEntity<Medico>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
        Medico obj = service.leerPorId(id);
        if (obj.getIdMedico() == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO "+ id);
        }
        service.eliminar(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
