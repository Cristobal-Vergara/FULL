package com.example.Meteorite.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private int id;
    private String cliente;
    private String producto;
    private Date fechaPedido;
    private String estado;
}
