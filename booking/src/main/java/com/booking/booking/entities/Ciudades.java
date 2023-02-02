package com.booking.booking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ciudades")
public class Ciudades {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nombreCiudad;

    public Ciudades(Long id) {
        this.id = id;
        this.nombreCiudad=nombreCiudad;
    }
}



