package com.Banco.Cuentas.Repository;

import com.Banco.Cuentas.Model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta,Long> {
}
