package com.Banco.Cuentas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "numcue")
    private Long id;
    @Column(name="persnum")
    private Integer persnum;
    @Column(name="divisa")
    private Integer divisa;
    @Column(name="estado")
    private Integer estado;
    @Column(name="saldo")
    private double saldo;

}
