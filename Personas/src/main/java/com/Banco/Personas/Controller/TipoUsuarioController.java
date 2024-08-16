package com.Banco.Personas.Controller;

import com.Banco.Personas.Model.TipoUsuario;
import com.Banco.Personas.Service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioService tipoUsuarioService;
    @GetMapping("/all")
    public ResponseEntity <List<TipoUsuario>> findAll(){
        return ResponseEntity.ok(tipoUsuarioService.tipoDeUsuario());
    }


}
