package com.parqueadero.parcial.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RegistroVehiculoDTO {
    private String placa;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private String ubicacion;
    private Long idTipoVehiculo;

    // Getters y setters

}