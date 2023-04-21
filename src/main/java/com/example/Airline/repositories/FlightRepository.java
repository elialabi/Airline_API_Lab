package com.example.Airline.repositories;

import com.example.Airline.models.Flight;
import com.example.Airline.models.Passenger;
import com.example.Airline.services.FlightService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface FlightRepository {


    FlightService findById(Long id);

    Flight save(Flight existingFlight);

    @Repository
    public interface flightRepository extends JpaRepository<Passenger, Long> {


    }


    }

