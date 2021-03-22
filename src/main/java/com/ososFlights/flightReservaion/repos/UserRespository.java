package com.ososFlights.flightReservaion.repos;

import com.ososFlights.flightReservaion.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
