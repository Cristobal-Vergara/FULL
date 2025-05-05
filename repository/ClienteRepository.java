package com.example.Meteorite.repository;

import com.example.Meteorite.model.Cliente;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();
    public List<Cliente> obtenerTodos() {
        return clientes;
    }

    public Cliente obtenerPorId(int id) {
        return clientes.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Cliente guardar(Cliente cliente) {
        clientes.removeIf(p -> p.getId() == cliente.getId());
        clientes.add(cliente);
        return cliente;
    }

    public void eliminar(int id) {
        clientes.removeIf(p -> p.getId() == id);
    }
}