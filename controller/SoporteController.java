package com.example.Meteorite.controller;

import com.example.Meteorite.model.Soporte;
import com.example.Meteorite.service.SoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/soporte")
public class SoporteController {
    
    @Autowired
    private SoporteController soporteService;

    @GetMapping
    public List<Soporte> obtenerTodos() {
        return soporteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Soporte obtenerPorId(@PathVariable int id) {
        return soporteService.obtenerPorId(id);
    }

    @PostMapping
    public Soporte guardar(@RequestBody Soporte soporte) {
        return soporteService.guardar(soporte);
    }

    @PutMapping("/{id}")
    public Soporte actualizar(@PathVariable int id, @RequestBody Soporte soporte) {
        soporte.setId(id);
        return soporteService.guardar(soporte);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        soporteService.eliminar(id);
    }
}
