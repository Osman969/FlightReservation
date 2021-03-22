package com.ososFlights.flightReservaion.repos;

import com.ososFlights.flightReservaion.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaionRespository extends JpaRepository<Reservation, Integer> {

}
