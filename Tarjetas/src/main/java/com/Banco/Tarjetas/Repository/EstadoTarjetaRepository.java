package com.Banco.Tarjetas.Repository;

import com.Banco.Tarjetas.Model.EstadoTarjeta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoTarjetaRepository  extends JpaRepository<EstadoTarjeta,Long> {
}
