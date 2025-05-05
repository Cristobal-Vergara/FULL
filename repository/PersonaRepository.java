package com.example.Meteorite.repository;

import com.example.Meteorite.model.Persona;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepository {
    private List<Persona> personas = new ArrayList<>();
    public List<Persona> obtenerTodos() {
        return personas;
    }

    public Persona obtenerPorId(int id) {
        return personas.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Persona guardar(Persona persona) {
        personas.removeIf(p -> p.getId() == persona.getId());
        personas.add(persona);
        return persona;
    }

    public void eliminar(int id) {
        personas.removeIf(p -> p.getId() == id);
    }
}