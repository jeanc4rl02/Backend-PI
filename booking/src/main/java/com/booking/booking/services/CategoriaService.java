package com.booking.booking.services;

import com.booking.booking.entities.Categorias;
import com.booking.booking.repositories.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriasRepository categoriasRepository;
    @Autowired
    public CategoriaService(CategoriasRepository categoriasRepository){
        this.categoriasRepository = categoriasRepository;
    }

    public Categorias post (Categorias categorias){return categoriasRepository.save(categorias);}

    public List<Categorias> getAll() {return categoriasRepository.findAll();}

    public Optional<Categorias> getOne(Long id){return categoriasRepository.findById(id);}

    public void put(Categorias categorias){categoriasRepository.save(categorias);}

    public void delete(Long id){categoriasRepository.deleteById(id);}
}





