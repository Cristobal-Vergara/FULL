package com.example.Meteorite.service;

import com.example.Meteorite.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();
    private int nextId = 1; 

    public List<Usuario> obtenerTodos() {
        return usuarios;
    }

    public Usuario obtenerPorId(int id) {
        Optional<Usuario> usuario = usuarios.stream().filter(u -> u.getId() == id).findFirst();
        return usuario.orElse(null);
    }

    public Usuario obtenerPorEmail(String email) {
        return usuarios.stream().filter(u -> u.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
    }

    public Usuario guardar(Usuario usuario) {
        if (usuario.getId() == 0) { 
            usuario.setId(nextId++);  
            usuarios.add(usuario);
        } else {  
            int index = -1;
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getId() == usuario.getId()) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                usuarios.set(index, usuario);  
            }
        }
        return usuario;
    }

    public void eliminar(int id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);  
    }
}
