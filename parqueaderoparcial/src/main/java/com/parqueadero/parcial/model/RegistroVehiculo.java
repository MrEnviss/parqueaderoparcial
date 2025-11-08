package com.parqueadero.parcial.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
public class RegistroVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 6)
    private String placa;

    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private TipoVehiculo tipoVehiculo;

    // Getters y setters (usa Lombok si prefieres)
}