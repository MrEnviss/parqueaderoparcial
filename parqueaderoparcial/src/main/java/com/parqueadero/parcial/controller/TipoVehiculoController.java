package com.parqueadero.parcial.controller;

import com.parqueadero.parcial.model.TipoVehiculo;
import com.parqueadero.parcial.repository.TipoVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @GetMapping
    public List<TipoVehiculo> listarTipos() {
        return tipoVehiculoRepository.findAll();
    }
}
