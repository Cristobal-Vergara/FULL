package com.example.Meteorite.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends Persona {
    private int id;
    private String userUsuario;
    private String contraseñaUsuario;
    private Date fechaRegistro;
    private String email;
}
