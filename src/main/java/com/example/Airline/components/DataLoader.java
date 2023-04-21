package com.example.Airline.components;

import com.example.Airline.models.Flight;
import com.example.Airline.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;



    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Flight flight1 = new Flight("NewYork", 50, "2023-05-01 ", "12:00:00");
        flightRepository.save(flight1);

        Flight flight2 = new Flight("London", 55, "2023-05-02", "15:30:00");
        flightRepository.save(flight2);

        Flight flight3 = new Flight("Toyko", 50, "2023-05-03", "08:15:00");
        flightRepository.save(flight3);
    }


    }





