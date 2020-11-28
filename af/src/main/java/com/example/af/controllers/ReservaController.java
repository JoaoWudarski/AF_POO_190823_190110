package com.example.af.controllers;

import com.example.af.model.Reserva;
import com.example.af.service.ReservaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    
    @Autowired
    private ReservaService reservaService;

    @GetMapping("/{codigo}")
    public ResponseEntity<Reserva> getReservaByCodigo(@PathVariable int codigo){
        Reserva aux = reservaService.getReservaByCodigo(codigo);
        return ResponseEntity.ok(aux);
    }
}
