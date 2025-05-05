package com.example.Meteorite.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Usuario {
    private String empresaCliente;
    private int rut;
    private String historialCompra;
}
