
package com.parqueadero.parcial.model;

import jakarta.persistence.*;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;



    public enum Rol {
        ADMINISTRADOR,
        ACOMODADOR,
        CLIENTE
    }
}

