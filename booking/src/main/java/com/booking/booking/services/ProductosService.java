package com.booking.booking.services;

import com.booking.booking.entities.Productos;
import com.booking.booking.repositories.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {
    private ProductosRepository productosRepository;

    @Autowired
    public ProductosService(ProductosRepository productosRepository){

        this.productosRepository = productosRepository;
    }

    public Productos post (Productos producto){return productosRepository.save(producto);}

    public List<Productos> getAll() {return productosRepository.findAll(); }

    public Optional<Productos> getOne(Long id){ return productosRepository.findById(id);}

    public void put(Productos producto){ productosRepository.save(producto);}

    public void delete (Long id){ productosRepository.deleteById(id);}


}
