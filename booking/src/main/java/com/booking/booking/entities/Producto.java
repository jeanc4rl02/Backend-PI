package com.booking.booking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String categoria;
    @Column
    private Double calificación;
    @Column
    private String ubicaciónClase;
    @Column
    private LocalDate fechaDisponible;
    @Column
    private LocalDate horarioDisponible;
    @Column
    private String nombreClase;
    @Column
    private String descripcionClase;
    @Column
    private String profesorDisponible;

    public Producto(String categoria, Double calificación, String ubicaciónClase, LocalDate fechaDisponible,
                    LocalDate horarioDisponible, String nombreClase, String descripcionClase, String profesorDisponible){
        this.calificación = calificación;
        this.ubicaciónClase = ubicaciónClase;
        this.fechaDisponible = fechaDisponible;
        this.horarioDisponible = horarioDisponible;
        this.nombreClase = nombreClase;
        this.descripcionClase = descripcionClase;
        this.profesorDisponible = profesorDisponible;
    }

}
