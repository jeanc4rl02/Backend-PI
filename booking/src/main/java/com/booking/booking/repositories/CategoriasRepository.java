package com.booking.booking.repositories;

import com.booking.booking.entities.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository <Categorias, Long > {
}
