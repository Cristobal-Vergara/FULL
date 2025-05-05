package com.example.Meteorite.service;

import com.example.Meteorite.model.Producto;
import com.example.Meteorite.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos() {
        return productoRepository.obtenerTodos();
    }

    public Producto obtenerPorId(int id) {
        return productoRepository.obtenerPorId(id);
    }

    public Producto guardar(Producto producto) {
        return productoRepository.guardar(producto);
    }

    public void eliminar(int id) {
        productoRepository.eliminar(id);
    }
}
