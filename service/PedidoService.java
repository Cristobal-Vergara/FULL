package com.example.Meteorite.service;

import com.example.Meteorite.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();
    private int nextId = 1;

    public List<Pedido> obtenerTodos() {
        return pedidos;
    }

    public Pedido obtenerPorId(int id) {
        return pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Pedido guardar(Pedido pedido) {
        if (pedido.getId() == 0) {
            pedido.setId(nextId++);
            pedidos.add(pedido);
        } else {
            int index = -1;
            for (int i = 0; i < pedidos.size(); i++) {
                if (pedidos.get(i).getId() == pedido.getId()) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                pedidos.set(index, pedido);
            }
        }
        return pedido;
    }

    public void eliminar(int id) {
        pedidos.removeIf(pedido -> pedido.getId() == id);
    }
}
