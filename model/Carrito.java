package com.example.Meteorite.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrito {
    private int id;
    private String cliente;
    private List<Producto> listaProducto;
    private String productoID;
    private int total;
}

