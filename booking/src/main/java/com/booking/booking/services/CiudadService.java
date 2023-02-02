package com.booking.booking.services;

<<<<<<< HEAD
import com.booking.booking.entities.Ciudad;
import com.booking.booking.repositories.CiudadRepository;
=======
import com.booking.booking.entities.Ciudades;
import com.booking.booking.repositories.CiudadesRepository;
>>>>>>> 8a1c224d270e598ecfa0c1853bb684a235de4bea
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {

<<<<<<< HEAD
    private CiudadRepository ciudadRepository;

    @Autowired
    public CiudadService(CiudadRepository ciudadRepository){

        this.ciudadRepository = ciudadRepository;
    }

    public Ciudad post (Ciudad ciudad){return ciudadRepository.save(ciudad);}

    public List<Ciudad> getAll() {return ciudadRepository.findAll();}

    public Optional<Ciudad> getOne(Long id){return ciudadRepository.findById(id);}

    public void put(Ciudad ciudad){
        ciudadRepository.save(ciudad);}

    public void delete(Long id){
        ciudadRepository.deleteById(id);}
=======
    private CiudadesRepository ciudadesRepository;

    @Autowired
    public CiudadService(CiudadesRepository ciudadesRepository){

        this.ciudadesRepository= ciudadesRepository;
    }

    public Ciudades post (Ciudades ciudades){return ciudadesRepository.save(ciudades);}

    public List<Ciudades> getAll() {return ciudadesRepository.findAll();}

    public Optional<Ciudades> getOne(Long id){return ciudadesRepository.findById(id);}

    public void put(Ciudades ciudades){ciudadesRepository.save(ciudades);}

    public void delete(Long id){ciudadesRepository.deleteById(id);}
>>>>>>> 8a1c224d270e598ecfa0c1853bb684a235de4bea

}
