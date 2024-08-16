package com.Banco.Personas.Service.impl;

import com.Banco.Personas.Model.Usuario;
import com.Banco.Personas.Repository.UsuarioRepository;
import com.Banco.Personas.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> usuario() {
        return usuarioRepository.findAll();
    }

}
