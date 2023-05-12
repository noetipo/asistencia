package com.example.asistencia.security.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginUsuario {
    @NotBlank(message = "nombre de usuario/email obligatorio")
    private String nombreUsuario;
    @NotBlank(message = "contraseña obligatoria")
    private String password;
}
