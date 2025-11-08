package com.parqueadero.parcial.controller;


import com.parqueadero.parcial.dto.RegistroVehiculoDTO;
import com.parqueadero.parcial.model.RegistroVehiculo;
import com.parqueadero.parcial.service.RegistroVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acomodador")
public class AcomodadorController {

    @Autowired
    private RegistroVehiculoService registroVehiculoService;

    @GetMapping("/vehiculos")
    public List<RegistroVehiculo> listar() {
        return registroVehiculoService.listarTodos();
    }

    @PutMapping("/vehiculos/{id}/ubicacion")
    public RegistroVehiculo actualizarUbicacion(@PathVariable Long id, @RequestBody RegistroVehiculoDTO dto) {
        return registroVehiculoService.actualizar(id, dto);
    }
}