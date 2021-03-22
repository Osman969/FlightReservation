package com.ososFlights.flightReservaion.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ososFlights.flightReservaion.entities.Passenger;

public interface PassengerRespository extends JpaRepository<Passenger, Integer> {

}
