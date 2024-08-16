package com.Banco.Cuentas.Service.impl;

import com.Banco.Cuentas.Model.CodigoMoneda;
import com.Banco.Cuentas.Repository.CodigoMonedaRepository;
import com.Banco.Cuentas.Service.CodigoMonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodigoMonedaServiceImpl implements CodigoMonedaService {
    @Autowired
    private CodigoMonedaRepository codigoMonedaRepository;

    @Override
    public List<CodigoMoneda> codigoMoneda(){
        return codigoMonedaRepository.findAll();
    }
}
