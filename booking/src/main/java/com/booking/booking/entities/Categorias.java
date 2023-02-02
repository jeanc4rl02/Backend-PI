package com.booking.booking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "categorias")
public class Categorias {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nombreCategorias;

    public Categorias(Long id) {
        this.id = id;
        this.nombreCategorias = nombreCategorias;
    }
}
