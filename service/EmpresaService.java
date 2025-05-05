package com.example.Meteorite.service;

import com.example.Meteorite.model.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    private List<Empresa> empresas = new ArrayList<>();

    public List<Empresa> obtenerTodos() {
        return empresas;
    }

    public Empresa obtenerPorRutEmpresa(String rutEmpresa) {
        return empresas.stream()
                .filter(e -> e.getRutEmpresa().equals(rutEmpresa))
                .findFirst()
                .orElse(null);
    }

    public Empresa guardar(Empresa empresa) {
        Empresa existente = obtenerPorRutEmpresa(empresa.getRutEmpresa());
        if (existente == null) {
            empresas.add(empresa); 
        } else {
            
            int index = empresas.indexOf(existente);
            empresas.set(index, empresa);
        }
        return empresa;
    }

    public void eliminarPorRutEmpresa(String rutEmpresa) {
        empresas.removeIf(empresa -> empresa.getRutEmpresa().equals(rutEmpresa));
    }
}
