package com.example.Airline.services;

import com.example.Airline.models.Flight;
import com.example.Airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;


    public Flight getPassengers(Long id) {
        Optional<Flight> passengerOptional = passengerRepository.findById(id);
        return passengerOptional.orElse(null);
    }
}
