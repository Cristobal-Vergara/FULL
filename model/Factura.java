package com.example.Meteorite.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factura {
    private int idFactura;
    private String cliente;
    private String producto;
    private int totalValor;
    private Date fecha;
    private String estadoPago;
}
