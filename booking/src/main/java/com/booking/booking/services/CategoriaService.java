package com.booking.booking.services;

<<<<<<< HEAD
import com.booking.booking.entities.Categoria;
import com.booking.booking.repositories.CategoriaRepository;
=======
import com.booking.booking.entities.Categorias;
import com.booking.booking.repositories.CategoriasRepository;
>>>>>>> 8a1c224d270e598ecfa0c1853bb684a235de4bea
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

<<<<<<< HEAD
    private CategoriaRepository categoriaRepository;
    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria post (Categoria categoria){return categoriaRepository.save(categoria);}

    public List<Categoria> getAll() {return categoriaRepository.findAll();}

    public Optional<Categoria> getOne(Long id){return categoriaRepository.findById(id);}

    public void put(Categoria categoria){
        categoriaRepository.save(categoria);}

    public void delete(Long id){
        categoriaRepository.deleteById(id);}
=======
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
>>>>>>> 8a1c224d270e598ecfa0c1853bb684a235de4bea
}





