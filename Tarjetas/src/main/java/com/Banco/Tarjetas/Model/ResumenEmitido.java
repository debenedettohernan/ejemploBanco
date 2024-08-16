package com.Banco.Tarjetas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resumen_emitidos")
public class ResumenEmitido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "resumeMongoID")
    private Long resumeMongoID;
    @Column(name="total_pesos")
    private String total_pesos;
    @Column(name="total_dolares")
    private String total_dolares;
    @Column(name="fecha_vencimiento")
    private String fecha_vencimiento;
}
