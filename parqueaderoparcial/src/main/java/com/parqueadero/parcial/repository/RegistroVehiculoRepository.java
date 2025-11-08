package com.parqueadero.parcial.repository;


import com.parqueadero.parcial.model.RegistroVehiculo;
import com.parqueadero.parcial.model.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroVehiculoRepository extends JpaRepository<RegistroVehiculo, Long> {}

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Long> {}