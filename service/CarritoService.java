package com.example.Meteorite.service;

import com.example.Meteorite.model.Carrito;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarritoService {

    private List<Carrito> carritos = new ArrayList<>();
    private int nextId = 1;  

    public List<Carrito> obtenerTodos() {
        return carritos;
    }

    public Carrito obtenerPorId(int id) {
        return carritos.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public Carrito guardar(Carrito carrito) {
        if (carrito.getId() == 0) {
            carrito.setId(nextId++);
            carritos.add(carrito);
        } else {
            int index = -1;
            for (int i = 0; i < carritos.size(); i++) {
                if (carritos.get(i).getId() == carrito.getId()) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                carritos.set(index, carrito);
            }
        }
        return carrito;
    }

    public void eliminar(int id) {
        carritos.removeIf(carrito -> carrito.getId() == id);
    }
}
