package com.ososFlights.flightReservaion.repos;

import java.util.Date;
import java.util.List;

import com.ososFlights.flightReservaion.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FlightRespository extends JpaRepository<Flight, Integer> {
    @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight> findFlights(
			@Param("departureCity")String from,
			@Param("arrivalCity") String to,
			@Param("dateOfDeparture") Date departureDate);

}
