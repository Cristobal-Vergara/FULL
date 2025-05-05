package com.example.Meteorite.service;

import com.example.Meteorite.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();
    private int nextId = 1;

    public List<Cliente> obtenerTodos() {
        return clientes;
    }

    public Cliente obtenerPorId(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public Cliente guardar(Cliente cliente) {
        if (cliente.getId() == 0) {
            cliente.setId(nextId++);
            clientes.add(cliente);
        } else {
            int index = -1;
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getId() == cliente.getId()) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                clientes.set(index, cliente);
            }
        }
        return cliente;
    }

    public void eliminar(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }
}
