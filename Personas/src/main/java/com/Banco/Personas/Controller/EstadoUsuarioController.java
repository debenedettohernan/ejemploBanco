package com.Banco.Personas.Controller;

import com.Banco.Personas.Model.EstadoUsuario;
import com.Banco.Personas.Service.EstadoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadousuario")
public class EstadoUsuarioController {
    @Autowired
    private EstadoUsuarioService estadoUsuarioService;
    @GetMapping("/all")
    public ResponseEntity<List<EstadoUsuario>> findAll(){
        return ResponseEntity.ok(estadoUsuarioService.estadoDeUsuario());
        }

}
