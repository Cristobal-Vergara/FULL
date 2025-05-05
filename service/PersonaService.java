package com.example.Meteorite.service;

import com.example.Meteorite.model.Persona;
import com.example.Meteorite.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> obtenerTodos() {
        return personaRepository.obtenerTodos();
    }

    public Persona obtenerPorId(int id) {
        return personaRepository.obtenerPorId(id);
    }

    public Persona guardar(Persona persona) {
        return personaRepository.guardar(persona);
    }

    public void eliminar(int id) {
        personaRepository.eliminar(id);
    }
}
