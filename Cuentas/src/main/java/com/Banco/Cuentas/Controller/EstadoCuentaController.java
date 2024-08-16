package com.Banco.Cuentas.Controller;


import com.Banco.Cuentas.Model.EstadoCuenta;
import com.Banco.Cuentas.Service.EstadoCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadocuenta")
public class EstadoCuentaController {
    @Autowired
    private EstadoCuentaService cuentaService;
    @GetMapping("/all")
    public ResponseEntity<List<EstadoCuenta>> findAll(){
        return ResponseEntity.ok(cuentaService.estadoCuenta());
}
}
