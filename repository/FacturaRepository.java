package com.example.Meteorite.repository;

import com.example.Meteorite.model.Factura;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaRepository {
    private List<Factura> facturas = new ArrayList<>();
    public List<Factura> obtenerTodos() {
        return facturas;
    }

    public Factura obtenerPorId(int id) {
        return facturas.stream()
                        .filter(f -> f.getIdFactura() == id)
                        .findFirst()
                        .orElse(null);
    }

    public Factura guardar(Factura Factura) {
        facturas.removeIf(f -> f.getIdFactura() == Factura.getIdFactura());
        facturas.add(Factura);
        return Factura;
    }

    public void eliminar(int id) {
        facturas.removeIf(f -> f.getIdFactura() == id);
    }
}