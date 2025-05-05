package com.example.Meteorite.repository;

import com.example.Meteorite.model.Proveedor;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class ProveedorRepository {
    private List<Proveedor> proveedores = new ArrayList<>();
    public List<Proveedor> obtenerTodos() {
        return proveedores;
    }

    public Proveedor obtenerPorId(int id) {
        return proveedores.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Proveedor guardar(Proveedor proveedor) {
        proveedores.removeIf(p -> p.getId() == proveedor.getId());
        proveedores.add(proveedor);
        return proveedor;
    }

    public void eliminar(int id) {
        proveedores.removeIf(p -> p.getId() == id);
    }
}