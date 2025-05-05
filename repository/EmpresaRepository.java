package com.example.Meteorite.repository;

import com.example.Meteorite.model.Empresa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpresaRepository {

    private List<Empresa> empresas = new ArrayList<>();

    public List<Empresa> findAll() {
        return empresas;
    }

    public Empresa findByRutEmpresa(String rutEmpresa) {
        return empresas.stream()
                .filter(e -> e.getRutEmpresa().equals(rutEmpresa))
                .findFirst()
                .orElse(null);
    }

    public Empresa save(Empresa empresa) {
        Empresa existente = findByRutEmpresa(empresa.getRutEmpresa());
        if (existente == null) {
            empresas.add(empresa); 
        } else {
            int index = empresas.indexOf(existente);
            empresas.set(index, empresa); 
        }
        return empresa;
    }

    public void deleteByRutEmpresa(String rutEmpresa) {
        empresas.removeIf(e -> e.getRutEmpresa().equals(rutEmpresa));
    }
}
