package com.example.Airline.models;

public class PassengerDTO {

    private String name;
    private String email;

    public PassengerDTO(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }
}
