package com.booking.booking.services;

import com.booking.booking.entities.Ciudades;
import com.booking.booking.repositories.CiudadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadesService {

    private CiudadesRepository ciudadesRepository;

    @Autowired
    public CiudadesService(CiudadesRepository ciudadesRepository){

        this.ciudadesRepository= ciudadesRepository;
    }

    public Ciudades post (Ciudades ciudades){return ciudadesRepository.save(ciudades);}

    public List<Ciudades> getAll() {return ciudadesRepository.findAll();}

    public Optional<Ciudades> getOne(Long id){return ciudadesRepository.findById(id);}

    public void put(Ciudades ciudades){ciudadesRepository.save(ciudades);}

    public void delete(Long id){ciudadesRepository.deleteById(id);}

}
