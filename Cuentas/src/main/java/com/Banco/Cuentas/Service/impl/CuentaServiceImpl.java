package com.Banco.Cuentas.Service.impl;

import com.Banco.Cuentas.Model.Cuenta;
import com.Banco.Cuentas.Repository.CuentaRepository;
import com.Banco.Cuentas.Service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;
    @Override
    public List<Cuenta> cuenta(){
        return cuentaRepository.findAll();
    }
}
