package com.example.Meteorite.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor extends Usuario{
    private int rutEmpresa;
    private String nombreEmpresa;
    private Producto producto;
    private int fono;
}
