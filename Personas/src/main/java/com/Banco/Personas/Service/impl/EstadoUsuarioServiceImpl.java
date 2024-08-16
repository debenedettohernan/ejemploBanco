package com.Banco.Personas.Service.impl;

import com.Banco.Personas.Model.EstadoUsuario;
import com.Banco.Personas.Repository.EstadoUsuarioRepository;
import com.Banco.Personas.Service.EstadoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoUsuarioServiceImpl implements EstadoUsuarioService {
    @Autowired
    private EstadoUsuarioRepository estadoUsuarioRepository;

    @Override
    public List<EstadoUsuario> estadoDeUsuario(){
        return estadoUsuarioRepository.findAll();
    }

}
