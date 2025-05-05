package com.example.Meteorite.service;
import com.example.Meteorite.model.Soporte;
import com.example.Meteorite.repository.SoporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoporteService {

    @Autowired
    private SoporteRepository soporteRepository;

    public List<Soporte> obtenerTodos() {
        return soporteRepository.obtenerTodos();
    }

    public Soporte obtenerPorId(int id) {
        return soporteRepository.obtenerPorId(id);
    }

    public Soporte guarda(Soporte soporte) {
        return soporteRepository.guardar(soporte);
    }

    public void eliminar(int id) {
        soporteRepository.eliminar(id);
    }
}
