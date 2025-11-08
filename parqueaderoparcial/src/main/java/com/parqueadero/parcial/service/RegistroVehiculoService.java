package com.parqueadero.parcial.service;

import com.parqueadero.parcial.dto.RegistroVehiculoDTO;
import com.parqueadero.parcial.model.RegistroVehiculo;
import com.parqueadero.parcial.model.TipoVehiculo;
import com.parqueadero.parcial.repository.RegistroVehiculoRepository;
import com.parqueadero.parcial.repository.TipoVehiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RegistroVehiculoService {

    private final RegistroVehiculoRepository registroVehiculoRepository;
    private final TipoVehiculoRepository tipoVehiculoRepository;

    public List<RegistroVehiculo> listarTodos() {
        return registroVehiculoRepository.findAll();
    }

    public RegistroVehiculo registrar(RegistroVehiculoDTO dto) {
        RegistroVehiculo vehiculo = new RegistroVehiculo();
        vehiculo.setPlaca(dto.getPlaca());
        vehiculo.setHoraEntrada(dto.getHoraEntrada());
        vehiculo.setHoraSalida(dto.getHoraSalida());
        vehiculo.setUbicacion(dto.getUbicacion());

        TipoVehiculo tipo = tipoVehiculoRepository.findById(dto.getIdTipoVehiculo())
                .orElseThrow(() -> new RuntimeException("Tipo de vehículo no encontrado"));
        vehiculo.setTipoVehiculo(tipo);

        return registroVehiculoRepository.save(vehiculo);
    }

    public RegistroVehiculo actualizar(Long id, RegistroVehiculoDTO dto) {
        RegistroVehiculo vehiculo = registroVehiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));

        vehiculo.setPlaca(dto.getPlaca());
        vehiculo.setHoraEntrada(dto.getHoraEntrada());
        vehiculo.setHoraSalida(dto.getHoraSalida());
        vehiculo.setUbicacion(dto.getUbicacion());

        TipoVehiculo tipo = tipoVehiculoRepository.findById(dto.getIdTipoVehiculo())
                .orElseThrow(() -> new RuntimeException("Tipo de vehículo no encontrado"));
        vehiculo.setTipoVehiculo(tipo);

        return registroVehiculoRepository.save(vehiculo);
    }

    public void eliminar(Long id) {
        registroVehiculoRepository.deleteById(id);
    }
}