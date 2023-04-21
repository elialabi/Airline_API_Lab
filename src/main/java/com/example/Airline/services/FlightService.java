package com.example.Airline.services;

import com.example.Airline.models.Flight;
import com.example.Airline.models.Passenger;
import com.example.Airline.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;




    public Flight createFlight(Long id, Flight flight) {
        Flight existingFlight = flightRepository.findById(id).createFlight(null);
        if (existingFlight == null) {
            return null;
        }
        
        existingFlight.setDepartureTime(flight.getDepartureTime());
        existingFlight.setDestination(flight.getDestination());

        return flightRepository.save(existingFlight);

    }

    public Flight createFlight(Flight flight){
        return flightRepository.save(flight);
    }
}

