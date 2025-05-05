package com.example.Meteorite.repository;

import com.example.Meteorite.model.Producto;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();
    public List<Producto> obtenerTodos() {
        return productos;
    }

    public Producto obtenerPorId(int id) {
        return productos.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Producto guardar(Producto producto) {
        productos.removeIf(p -> p.getId() == producto.getId());
        productos.add(producto);
        return producto;
    }

    public void eliminar(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}
