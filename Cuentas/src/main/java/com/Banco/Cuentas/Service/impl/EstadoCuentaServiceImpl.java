package com.Banco.Cuentas.Service.impl;


import com.Banco.Cuentas.Model.EstadoCuenta;

import com.Banco.Cuentas.Repository.EstadoCuentaRepository;
import com.Banco.Cuentas.Service.EstadoCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoCuentaServiceImpl implements EstadoCuentaService {
    @Autowired
    private EstadoCuentaRepository estadoCuentaRepository;
    @Override
    public List<EstadoCuenta> estadoCuenta(){
        return estadoCuentaRepository.findAll();
    }
}
