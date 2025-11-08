package com.parqueadero.parcial.controller;



import com.parqueadero.parcial.model.RegistroVehiculo;
import com.parqueadero.parcial.service.RegistroVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private RegistroVehiculoService registroVehiculoService;

    @GetMapping("/vehiculos")
    public List<RegistroVehiculo> listar() {
        return registroVehiculoService.listarTodos();
    }
}