package com.example.Airline.repositories;

import com.example.Airline.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Flight, Long> {
}
