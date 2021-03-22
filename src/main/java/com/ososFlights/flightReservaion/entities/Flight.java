package com.ososFlights.flightReservaion.entities;

import java.sql.Timestamp;
import java.util.Date;


import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {

	private String flightNumber;
	private String operationAirlines ;
	private String departureCity ;
  	private String arrivalCity ;
	private Date  dateOfDeparture;
	private Timestamp  estimateDepartureTime;

public String getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(String flightnumber) {
	this.flightNumber = flightnumber;
}
public String getOperationAirlines() {
	return operationAirlines;
}
public void setOperationAirlines(String operationAirlines) {
	this.operationAirlines = operationAirlines;
}
public String getDepartureCity() {
	return departureCity;
}
public void setDepartureCity(String departureCity) {
	this.departureCity = departureCity;
}
public String getArrivalCity() {
	return arrivalCity;
}
public void setArrivalCity(String arrivalCity) {
	this.arrivalCity = arrivalCity;
}
public Date getDateOfDeparture() {
	return dateOfDeparture;
}
public void setDateOfDeparture(Date dateOfDeparture) {
	this.dateOfDeparture = dateOfDeparture;
}
public Timestamp getEstimateDepartureTime() {
	return estimateDepartureTime;
}
public void setEstimateDepartureTime(Timestamp estimateDepartureTime) {
	this.estimateDepartureTime = estimateDepartureTime;
}
@Override
public String toString() {
	return "Flight [flightNumber=" + flightNumber + ", operationAirlines=" + operationAirlines + ", departureCity="
			+ departureCity + ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture
			+ ", estimateDepartureTime=" + estimateDepartureTime + "]";
}


	
}
