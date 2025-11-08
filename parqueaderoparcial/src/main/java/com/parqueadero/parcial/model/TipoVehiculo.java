package com.parqueadero.parcial.model;

import jakarta.persistence.*;

@Entity
public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Getters y setters
}