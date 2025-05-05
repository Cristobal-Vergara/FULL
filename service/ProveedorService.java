package com.example.Meteorite.service;

import com.example.Meteorite.model.Proveedor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProveedorService {

    private List<Proveedor> proveedores = new ArrayList<>();
    private int nextId = 1;

    public List<Proveedor> obtenerTodos() {
        return proveedores;
    }

    public Proveedor obtenerPorId(int id) {
        return proveedores.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public Proveedor guardar(Proveedor proveedor) {
        if (proveedor.getId() == 0) {
            proveedor.setId(nextId++);
            proveedores.add(proveedor);
        } else {
            int index = -1;
            for (int i = 0; i < proveedores.size(); i++) {
                if (proveedores.get(i).getId() == proveedor.getId()) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                proveedores.set(index, proveedor);
            }
        }
        return proveedor;
    }

    public void eliminar(int id) {
        proveedores.removeIf(proveedor -> proveedor.getId() == id);
    }
}
