package com.pruebatecnica.rolly.service.Impl;

import com.pruebatecnica.rolly.model.Persona;
import com.pruebatecnica.rolly.repository.PersonaRepository;
import com.pruebatecnica.rolly.service.CentroDistribucionService;
import com.pruebatecnica.rolly.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.pruebatecnica.rolly.common.CentroDistribucion;

@Service
public class CentroDistribucionServiceImpl implements CentroDistribucionService {

    @Override
    public String obtenerDescripcionNombre(String centro) {
        for (CentroDistribucion CentroDistribucion : CentroDistribucion.values()) {
            if (CentroDistribucion.name().equalsIgnoreCase(centro)) {
                String nombreCentroPorDescripcion = "SE ENCONTRO CORRECTAMENTE EL DISTRITO CENTRO DE DISTRIBUCION "+   CentroDistribucion.getValue();
                return nombreCentroPorDescripcion;
            }
        }
        return "DISTRITO CENTRO DE DISTRIBUCION NO ENCONTRADO";
    }

}
