package com.example.Meteorite.controller;

import com.example.Meteorite.model.Carrito;
import com.example.Meteorite.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carritos")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public List<Carrito> obtenerTodos() {
        return carritoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Carrito obtenerPorId(@PathVariable int id) {
        return carritoService.obtenerPorId(id);
    }

    @PostMapping
    public Carrito crear(@RequestBody Carrito carrito) {
        return carritoService.guardar(carrito);
    }

    @PutMapping("/{id}")
    public Carrito actualizar(@PathVariable int id, @RequestBody Carrito carrito) {
        carrito.setId(id);
        return carritoService.guardar(carrito);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        carritoService.eliminar(id);
    }
}
