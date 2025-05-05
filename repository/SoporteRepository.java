package com.example.Meteorite.repository;

import com.example.Meteorite.model.Soporte;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class SoporteRepository {
    private List<Soporte> soportes = new ArrayList<>();
    public List<Soporte> obtenerTodos() {
        return soportes;
    }

    public Soporte obtenerPorId(int id) {
        return soportes.stream()
                        .filter(p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Soporte guardar(Soporte soporte) {
        soportes.removeIf(p -> p.getId() == soporte.getId());
        soportes.add(soporte);
        return soporte;
    }

    public void eliminar(int id) {
        soportes.removeIf(p -> p.getId() == id);
    }
}