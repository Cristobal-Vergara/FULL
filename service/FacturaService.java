package com.example.Meteorite.service;

import com.example.Meteorite.model.Factura;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacturaService {

    private List<Factura> facturas = new ArrayList<>();
    private int nextId = 1;

    public List<Factura> obtenerTodas() {
        return facturas;
    }

    public Factura obtenerPorId(int id) {
        return facturas.stream()
                .filter(f -> f.getIdFactura() == id)
                .findFirst()
                .orElse(null);
    }

    public Factura guardar(Factura factura) {
        if (factura.getIdFactura() == 0) {
            factura.setIdFactura(nextId++);
            facturas.add(factura);
        } else {
            int index = -1;
            for (int i = 0; i < facturas.size(); i++) {
                if (facturas.get(i).getIdFactura() == factura.getIdFactura()) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                facturas.set(index, factura);
            }
        }
        return factura;
    }

    public void eliminar(int id) {
        facturas.removeIf(factura -> factura.getIdFactura() == id);
    }
}
