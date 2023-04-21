package com.example.Airline.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "chocolates")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Autowired
    Flight flight;


    @Column
    private Long Id;

    @Column
    private String name;

    @Column
    private String email;

    @JsonIgnoreProperties({"passengers"})
    @ManyToMany(mappedBy = "passengers")
    private List<Flight> flights = new ArrayList<>();


    public Passenger(String name, String email ){
        this.name = name;
        this.email = email;
    }

    public Passenger(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}


