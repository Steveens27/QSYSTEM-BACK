package com.pruebatecnica.rolly.controller;

import com.pruebatecnica.rolly.model.Persona;
import com.pruebatecnica.rolly.request.BusquedaRequest;
import com.pruebatecnica.rolly.service.CentroDistribucionService;
import com.pruebatecnica.rolly.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("v1/centro")
public class CentroDistribucionController {
    @Autowired
    CentroDistribucionService CentroDistribucionService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/obtenerDescripcionNombre")
    public BusquedaRequest obtenerDescripcionNombre(@RequestParam String centro) {
        BusquedaRequest busquedad = new BusquedaRequest();
        busquedad.setRespuesta(CentroDistribucionService.obtenerDescripcionNombre(centro));
        return busquedad;
    }



}


