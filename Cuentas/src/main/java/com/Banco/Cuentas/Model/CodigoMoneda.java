package com.Banco.Cuentas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "codigo_moneda")
public class CodigoMoneda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "cod_moneda")
    private Long id;
    @Column(name="pais")
    private String pais;
    @Column(name="simbolo")
    private String simbolo;
}
