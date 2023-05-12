package com.example.asistencia.security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
@Data
public class NuevoUsuario {
    @NotBlank(message = "nombre obligatorio")
    private String nombre;
    @NotBlank(message = "nombre de usuario obligatorio")
    private String nombreUsuario;
    @Email(message = "dirección de email no válida")
    @NotBlank(message = "email obligatorio")
    private String email;
    @NotBlank
    private String password;
    private Set<String> roles = new HashSet<>();
}
