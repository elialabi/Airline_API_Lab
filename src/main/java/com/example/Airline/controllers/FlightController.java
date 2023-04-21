package com.example.Airline.controllers;


import com.example.Airline.models.Flight;
import com.example.Airline.repositories.PassengerRepository;
import com.example.Airline.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private PassengerService passengerService;

    @GetMapping
    private List<Flight> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getPassengerId(@PathVariable Long id) {
        Flight passenger = passengerService.getPassengers(id);
        if (passenger != null) {
            return ResponseEntity.ok(passenger);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

