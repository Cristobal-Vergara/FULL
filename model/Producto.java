package com.example.Meteorite.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int id;
    private String nombre;
    private int precio;
    private int stock;
    private String descripcion;
    private String proveedor;
}
