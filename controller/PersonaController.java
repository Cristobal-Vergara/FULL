package com.example.Meteorite.controller;

import com.example.Meteorite.model.Persona;
import com.example.Meteorite.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {


    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> obtenerTodos() {
        return personaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Persona obtenerPorId(@PathVariable int id) {
        return personaService.obtenerPorId(id);
    }

    @PostMapping
    public Persona crear(@RequestBody Persona persona) {
        return personaService.guardar(persona);
    }

    @PutMapping("/{id}")
    public Persona actualizar(@PathVariable int id, @RequestBody Persona persona) {
        persona.setId(id);
        return personaService.guardar(persona);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        personaService.eliminar(id);
    }
}
