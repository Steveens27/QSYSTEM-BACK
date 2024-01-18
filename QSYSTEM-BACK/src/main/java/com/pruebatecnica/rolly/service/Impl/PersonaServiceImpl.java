package com.pruebatecnica.rolly.service.Impl;

import com.pruebatecnica.rolly.model.Persona;
import com.pruebatecnica.rolly.repository.PersonaRepository;
import com.pruebatecnica.rolly.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personRepository;

    public List<Persona> ordenarListaPersona() {

        return personRepository.findAll().stream().sorted(Comparator.comparing(Persona::getDni))
                .collect(Collectors.toList());
    }

    public List<Persona> ordenarPersonaPorAppPaterno() {
        return personRepository.findAll().stream()
                .sorted(Comparator.comparing(persona -> persona.getAppPaterno().toLowerCase()))
                .collect(Collectors.toList());
    }

}
