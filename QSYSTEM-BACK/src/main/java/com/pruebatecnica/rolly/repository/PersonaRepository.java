package com.pruebatecnica.rolly.repository;

import com.pruebatecnica.rolly.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    List<Persona> findFirstByAppMaterno(String apPaterno);
}