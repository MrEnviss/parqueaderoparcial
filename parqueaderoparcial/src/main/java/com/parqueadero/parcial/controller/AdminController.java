package com.parqueadero.parcial.controller;



import com.parqueadero.parcial.dto.RegistroVehiculoDTO;
import com.parqueadero.parcial.model.RegistroVehiculo;
import com.parqueadero.parcial.service.RegistroVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private RegistroVehiculoService registroVehiculoService;

    @GetMapping("/vehiculos")
    public List<RegistroVehiculo> listar() {
        return registroVehiculoService.listarTodos();
    }

    @PostMapping("/vehiculos")
    public RegistroVehiculo registrar(@RequestBody RegistroVehiculoDTO dto) {
        return registroVehiculoService.registrar(dto);
    }

    @PutMapping("/vehiculos/{id}")
    public RegistroVehiculo actualizar(@PathVariable Long id, @RequestBody RegistroVehiculoDTO dto) {
        return registroVehiculoService.actualizar(id, dto);
    }

    @DeleteMapping("/vehiculos/{id}")
    public void eliminar(@PathVariable Long id) {
        registroVehiculoService.eliminar(id);
    }
}