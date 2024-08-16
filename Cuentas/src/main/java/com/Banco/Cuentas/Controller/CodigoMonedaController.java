package com.Banco.Cuentas.Controller;

import com.Banco.Cuentas.Model.CodigoMoneda;
import com.Banco.Cuentas.Service.CodigoMonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/codigomoneda")
public class CodigoMonedaController {
    @Autowired
    private CodigoMonedaService codigoMonedaService;
    @GetMapping("/all")
    public ResponseEntity<List<CodigoMoneda>> findAll(){
        return ResponseEntity.ok(codigoMonedaService.codigoMoneda());
    }
}
