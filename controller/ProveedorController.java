package com.example.Meteorite.controller;

import com.example.Meteorite.model.Proveedor;
import com.example.Meteorite.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    public List<Proveedor> obtenerTodos() {
        return proveedorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Proveedor obtenerPorId(@PathVariable int id) {
        return proveedorService.obtenerPorId(id);
    }

    @PostMapping
    public Proveedor crear(@RequestBody Proveedor proveedor) {
        return proveedorService.guardar(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedor actualizar(@PathVariable int id, @RequestBody Proveedor proveedor) {
        proveedor.setId(id);
        return proveedorService.guardar(proveedor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        proveedorService.eliminar(id);
    }
}
