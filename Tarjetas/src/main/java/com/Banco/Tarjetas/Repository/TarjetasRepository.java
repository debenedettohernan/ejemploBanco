package com.Banco.Tarjetas.Repository;

import com.Banco.Tarjetas.Model.Tarjetas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetasRepository extends JpaRepository<Tarjetas,Long> {
}
