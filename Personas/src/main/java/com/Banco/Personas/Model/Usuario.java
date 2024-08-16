package com.Banco.Personas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "persnum")
    private Long id;
    @Column(name= "nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private String dni;
    @Column(name="estado")
    private Integer estado;
    @Column(name="tipo")
    private Integer tipo;
}
