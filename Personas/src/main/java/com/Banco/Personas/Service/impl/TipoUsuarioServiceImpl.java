package com.Banco.Personas.Service.impl;

import com.Banco.Personas.Model.TipoUsuario;
import com.Banco.Personas.Repository.TipoUsuarioRepository;
import com.Banco.Personas.Service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {
    @Autowired
    private TipoUsuarioRepository tipoDeUsuarioRepository ;

    @Override
    public List<TipoUsuario> tipoDeUsuario() {
        return tipoDeUsuarioRepository.findAll();
    }

}
