package com.booking.booking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Double calificación;
    @Column
    private String ubicaciónClase;
    @Column
    private LocalDate fechaDisponible;
    @Column
    private LocalTime horarioDisponible;
    @Column
    private String nombreClase;
    @Column
    private String descripcionClase;

    @ManyToOne
    private Ciudad ciudad;

    @ManyToOne
    private Entrenador entrenador;

    @ManyToMany(mappedBy = "productoSet")
    private Set<Categoria> categorias=new HashSet<>();

    public Producto(Double calificación, String ubicaciónClase, LocalDate fechaDisponible, LocalTime horarioDisponible, String nombreClase, String descripcionClase) {
        this.calificación = calificación;
        this.ubicaciónClase = ubicaciónClase;
        this.fechaDisponible = fechaDisponible;
        this.horarioDisponible = horarioDisponible;
        this.nombreClase = nombreClase;
        this.descripcionClase = descripcionClase;
    }
}
