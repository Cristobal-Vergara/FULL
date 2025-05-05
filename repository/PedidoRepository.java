package com.example.Meteorite.repository;

import com.example.Meteorite.model.Pedido;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();
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
        pedidos.removeIf(p -> p.getId() == pedido.getId());
        pedidos.add(pedido);
        return pedido;
    }

    public void eliminar(int id) {
        pedidos.removeIf(p -> p.getId() == id);
    }
}