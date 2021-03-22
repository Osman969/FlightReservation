package com.ososFlights.flightReservaion.controllers;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ososFlights.flightReservaion.entities.Flight;
import com.ososFlights.flightReservaion.repos.FlightRespository;
@Controller
public class FlightController {
@Autowired
FlightRespository  flightRespository;
	
private static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);

	
	@RequestMapping("/findflights")
	public String findFlights(@RequestParam("from") String from ,
	@RequestParam("to") String to ,
	@RequestParam("departureDate") @DateTimeFormat(pattern ="MM-dd-yyyy") Date departureDate,
	ModelMap modelMap ){
		LOGGER.info("Inside findFlights() FROM"+from+" TO "+to+"departureDate"+departureDate);

		List<Flight> flights = flightRespository.findFlights(from,to,departureDate);
		modelMap.addAttribute("flights",flights);
		LOGGER.info("Inside found are:"+flights);
		return "displayFlights";	
	}
	
	@RequestMapping("admin/showAddflight")
	public String showAddFlight(){
		return "addFlight";
		
		}
}
