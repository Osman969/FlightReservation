package com.ososFlights.flightReservaion.dto;

public class ReservationRequest {
	private int flightId;
	private String passengerFirstName;
	private String passengerlastName;
	private String passengerEmail;
	private String passengerPhone;
	private String nameOnTheCard;
	private String CardNumber;
	private String experiDate;
	private String securityCode;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getPassengerFirstName() {
		return passengerFirstName;
	}
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}
	public String getPassengerlastName() {
		return passengerlastName;
	}
	public void setPassengerlastName(String passengerlastName) {
		this.passengerlastName = passengerlastName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getExperiDate() {
		return experiDate;
	}
	public void setExperiDate(String experiDate) {
		this.experiDate = experiDate;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	@Override
	public String toString() {
		return "ReservationRequest [flightId=" + flightId + ", passengerFirstName=" + passengerFirstName
				+ ", passengerlastName=" + passengerlastName + ", passengerEmail=" + passengerEmail
				+ ", passengerPhone=" + passengerPhone + ", nameOnTheCard=" + nameOnTheCard + ", CardNumber="
				+ CardNumber + ", experiDate=" + experiDate + ", securityCode=" + securityCode + "]";
	}

	

}
