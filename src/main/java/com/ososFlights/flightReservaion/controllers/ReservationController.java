package com.ososFlights.flightReservaion.controllers;

import com.ososFlights.flightReservaion.entities.Reservation;
import com.ososFlights.flightReservaion.services.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ososFlights.flightReservaion.dto.ReservationRequest;
import com.ososFlights.flightReservaion.entities.Flight;
import com.ososFlights.flightReservaion.repos.FlightRespository;

@Controller
public class ReservationController {
	@Autowired
	FlightRespository  flightRespository;
	@Autowired
	ReservationService reservationService;
    
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservationController.class);

    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") int flightId ,
    		ModelMap modelMap ){
    	LOGGER.info("Inside showCompleteReservation() FLIGHT_ID: "+flightId);
    	Flight flight = flightRespository.findById(flightId).get();
    	
    	
    	modelMap.addAttribute("flight",flight);
    	LOGGER.info("Inside FlightIs: "+flight);
		return "CompleteReservation";

    }
    @RequestMapping(value = "/completeReservation" ,method = RequestMethod.POST)
    public String completeReservation(ReservationRequest request,
    		ModelMap modelMap) {
    	LOGGER.info("Inside completeReservation()"+request);

    	Reservation reservation = reservationService.bookFlight(request);
    	modelMap.addAttribute("msg", "Reservation created successfully and the id is "+ reservation.getId());
    	
		return "reservationConfirmation";
    	
    }
    
}
