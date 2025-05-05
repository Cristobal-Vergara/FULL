package com.example.Meteorite.repository;

import com.example.Meteorite.model.Carrito;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class CarritoRepository {
    private List<Carrito> carritos = new ArrayList<>();
    public List<Carrito> obtenerTodos() {
        return carritos;
    }

    public Carrito obtenerPorId(int id) {
        return carritos.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Carrito guardar(Carrito carrito) {
        carritos.removeIf(p -> p.getId() == carrito.getId());
        carritos.add(carrito);
        return carrito;
    }

    public void eliminar(int id) {
        carritos.removeIf(p -> p.getId() == id);
    }
}
