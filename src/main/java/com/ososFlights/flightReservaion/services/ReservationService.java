package com.ososFlights.flightReservaion.services;

import com.ososFlights.flightReservaion.dto.ReservationRequest;
import com.ososFlights.flightReservaion.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
