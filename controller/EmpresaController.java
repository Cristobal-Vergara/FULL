package com.example.Meteorite.controller;

import com.example.Meteorite.model.Empresa;
import com.example.Meteorite.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public List<Empresa> obtenerTodas() {
        return empresaService.obtenerTodos();
    }

    @GetMapping("/{rutEmpresa}")
    public Empresa obtenerPorRutEmpresa(@PathVariable String rutEmpresa) {
        return empresaService.obtenerPorRutEmpresa(rutEmpresa);
    }

    @PostMapping
    public Empresa crearEmpresa(@RequestBody Empresa empresa) {
        return empresaService.guardar(empresa);
    }

    @PutMapping("/{rutEmpresa}")
    public Empresa actualizarEmpresa(@PathVariable String rutEmpresa, @RequestBody Empresa empresa) {
        Empresa existente = empresaService.obtenerPorRutEmpresa(rutEmpresa);
        if (existente != null) {
            
            empresa.setRutEmpresa(rutEmpresa);
            return empresaService.guardar(empresa);
        } else {
            
            return empresaService.guardar(empresa);
        }
    }

    @DeleteMapping("/{rutEmpresa}")
    public void eliminarEmpresa(@PathVariable String rutEmpresa) {
        empresaService.eliminarPorRutEmpresa(rutEmpresa);
    }
}
