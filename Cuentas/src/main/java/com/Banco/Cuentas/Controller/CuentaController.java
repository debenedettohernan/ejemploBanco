package com.Banco.Cuentas.Controller;

import com.Banco.Cuentas.Model.Cuenta;
import com.Banco.Cuentas.Service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
    @Autowired
    private CuentaService cuentaService;
    @GetMapping("/all")
    public ResponseEntity<List<Cuenta>> findAll(){
        return ResponseEntity.ok(cuentaService.cuenta());
    }


}
