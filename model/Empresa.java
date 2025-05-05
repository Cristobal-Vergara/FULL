package com.example.Meteorite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List; 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    private String nombreEmpresa;
    private String rutEmpresa;
    private String direccion;
    private int telefono;
    private String email;
    private String representante;
    private List<Cliente> clientes;
    private List<Proveedor> proveedores;
    private LocalDate fechaCreacion; 
}
