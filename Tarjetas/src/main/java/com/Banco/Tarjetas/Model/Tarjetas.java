package com.Banco.Tarjetas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tarjetas")
public class Tarjetas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "numtarj")
    private Long id;
    @Column(name="numcue")
    private Integer numcue;
    @Column(name="f_vencimiento")
    private String f_vencimiento;
    @Column(name="pin")
    private Integer pin;
    @Column(name="estado")
    private Integer estado;
    @Column(name="f_emision")
    private String f_emision;
    @Column(name="tipo")
    private String tipo;
}
