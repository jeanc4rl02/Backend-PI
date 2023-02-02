package com.booking.booking.repositories;

import com.booking.booking.entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
}
