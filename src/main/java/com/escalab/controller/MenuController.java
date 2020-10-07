package com.escalab.controller;

import com.escalab.model.Menu;
import com.escalab.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private IMenuService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Menu>> listar(){
        List<Menu> menues = new ArrayList<>();
        menues = service.listar();
        return new ResponseEntity<List<Menu>>(menues, HttpStatus.OK);
    }

    @PostMapping(value = "usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Menu>> listar(@RequestBody String nombre){
        List<Menu> menus = new ArrayList<>();
        menus = service.listarMenuPorUsuario(nombre);
        return new ResponseEntity<List<Menu>>(menus, HttpStatus.OK);
    }

}
