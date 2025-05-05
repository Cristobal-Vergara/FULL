package com.example.Meteorite.controller;

import com.example.Meteorite.model.Factura;
import com.example.Meteorite.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> obtenerTodas() {
        return facturaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Factura obtenerPorId(@PathVariable int id) {
        return facturaService.obtenerPorId(id);
    }

    @PostMapping
    public Factura crear(@RequestBody Factura factura) {
        return facturaService.guardar(factura);
    }

    @PutMapping("/{id}")
    public Factura actualizar(@PathVariable int id, @RequestBody Factura factura) {
        factura.setIdFactura(id);
        return facturaService.guardar(factura);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        facturaService.eliminar(id);
    }
}
