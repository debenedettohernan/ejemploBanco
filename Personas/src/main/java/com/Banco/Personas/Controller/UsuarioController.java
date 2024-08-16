package com.Banco.Personas.Controller;

import com.Banco.Personas.Model.Usuario;
import com.Banco.Personas.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> findAll(){
        return ResponseEntity.ok(usuarioService.usuario());
    }
}
