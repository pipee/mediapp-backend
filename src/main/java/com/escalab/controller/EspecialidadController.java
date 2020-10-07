package com.escalab.controller;

import com.escalab.exception.ModeloNotFoundException;
import com.escalab.model.Especialidad;
import com.escalab.service.IEspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    @Autowired
    private IEspecialidadService service;

    @GetMapping
    public ResponseEntity<List<Especialidad>> listar(){
        List<Especialidad> lista =  service.listar();
        return new ResponseEntity<List<Especialidad>>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidad> listarPorId(@PathVariable("id") Integer id){
        Especialidad obj = service.leerPorId(id);
        if (obj.getIdEspecialidad() == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO "+id);
        }
        return new ResponseEntity<Especialidad>(obj,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> registrar(@Valid @RequestBody Especialidad especialidad){
        Especialidad obj = service.registrar(especialidad);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(especialidad.getIdEspecialidad()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Especialidad> modificar(@Valid @RequestBody Especialidad especialidad){
        Especialidad obj = service.modificar(especialidad);
        return new ResponseEntity<Especialidad>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
        Especialidad obj = service.leerPorId(id);
        if (obj.getIdEspecialidad() == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO "+id);
        }
        service.eliminar(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
