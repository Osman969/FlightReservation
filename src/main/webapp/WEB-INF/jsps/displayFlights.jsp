<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights</title>
</head>
<body>
<h1>Flights</h1>
<div align="center">
        <table border="1" cellpadding="5">
            <tr>
                <th>Airlines</th>
                <th>Departure City</th>
                <th>Arrival City</th>
                <th>Departure Time</th>
            </tr>
            <c:forEach  items="${flights}" var="flight" >
                <tr>
                    <td>"${flight.operationAirlines}"</td>
                    <td>"${flight.departureCity}"</td>
                    <td>"${flight.arrivalCity}"</td>
                    <td>"${flight.estimateDepartureTime}"</td>
                    <td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
                    
                    
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>