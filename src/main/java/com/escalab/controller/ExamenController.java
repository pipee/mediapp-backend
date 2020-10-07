package com.escalab.controller;

import com.escalab.exception.ModeloNotFoundException;
import com.escalab.model.Examen;
import com.escalab.service.IExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/examenes")
public class ExamenController {

    @Autowired
    private IExamenService service;

    @GetMapping
    public ResponseEntity<List<Examen>> listar(){
        List<Examen> lista = service.listar();
        return new ResponseEntity<List<Examen>>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Examen> listarPorId(@PathVariable("id") Integer id){
        Examen obj = service.leerPorId(id);
        if (obj.getIdExamen() == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO "+ id);
        }
        return new ResponseEntity<Examen>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> registrar(@Valid @RequestBody Examen examen){
        Examen obj = service.registrar(examen);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(examen.getIdExamen()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<Examen> modificar(@Valid @RequestBody Examen examen){
        Examen obj = service.modificar(examen);
        return new ResponseEntity<Examen>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
        Examen obj = service.leerPorId(id);
        if (obj.getIdExamen() == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO "+ id);
        }
        service.eliminar(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
