package com.ososFlights.flightReservaion.controllers;

import com.ososFlights.flightReservaion.entities.Reservation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ososFlights.flightReservaion.dto.UpdateReservationRequest;
import com.ososFlights.flightReservaion.repos.ReservaionRespository;

@RestController
public class ReservationRestController {
	@Autowired
	ReservaionRespository reservaionRespository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationRestController.class);

	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation (@PathVariable ("id") int id) {
		LOGGER.info("Inside findReservation for id"+id);

		
		return reservaionRespository.findById(id).get();
	}
	@RequestMapping("/reservations")
public Reservation updateReservation (@RequestBody UpdateReservationRequest request) {
		LOGGER.info("Inside updateReservation for "+request);

Reservation reservation = reservaionRespository.findById(request.getId()).get();
reservation.setNumberOfBags(request.getNumberOfBags());
reservation.setCheckedIn(request.getCheckedIn());
LOGGER.info("SAVING RESERVATION ");

	return reservaionRespository.save(reservation);
		
	}

}
	