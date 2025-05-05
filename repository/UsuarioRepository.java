package com.example.Meteorite.repository;

import com.example.Meteorite.model.Usuario;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();
    public List<Usuario> obtenerTodos() {
        return usuarios;
    }

    public Usuario obtenerPorId(int id) {
        return usuarios.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Usuario guardar(Usuario Usuario) {
        usuarios.removeIf(p -> p.getId() == Usuario.getId());
        usuarios.add(Usuario);
        return Usuario;
    }

    public void eliminar(int id) {
        usuarios.removeIf(p -> p.getId() == id);
    }
}