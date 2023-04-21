package com.example.Airline.models;

import jakarta.persistence.*;

@Entity(name = "chocolates")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column
    private Long Id;

    @Column
    private String name;

    @Column
    private String email;

    @ManyToMany
    @JoinTable(
           name = "passenger_flights",
            joinColumns = @JoinTable(name = "flight_id")
            inverseJoinColumns = @JoinTable(name = "passenger_Id")
    )


    public Flight( String name, String email ){
        this.name = name;
        this.email = email;
    }

    public Flight(){

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
}


