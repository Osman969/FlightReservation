package com.ososFlights.flightReservaion.controllers;


import com.ososFlights.flightReservaion.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ososFlights.flightReservaion.repos.UserRespository;
import com.ososFlights.flightReservaion.services.SecurityService;



@Controller
public class UserController {
	@Autowired
	private UserRespository userRespository;
	@Autowired
	private SecurityService securityService;
	@Autowired
	private BCryptPasswordEncoder encoder;
	 private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	 
	 
	@RequestMapping("/showReg")
	public String showRegistrationPage(){
		LOGGER.info("Inside showRegistrationPage()" );
		return "login/registerUser";	
	}

	
	@RequestMapping(value="/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user){
		LOGGER.info("Inside register()"+user );
		user.setPassword(encoder.encode(user.getPassword()));
		userRespository.save(user);
		return "login/login";	
	}
	@RequestMapping("/showLogin")
	public String showLoginPage(){
		LOGGER.info("Inside showLoginPage()");
		return "login/login";	
	}
	
	
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email,
	@RequestParam("password") String password , ModelMap modelMap ){
		boolean login = securityService.login(email, password);
		LOGGER.info("Inside login() and the email is: "+email);
		if (login) {
			return "findflights";
		}else {
			modelMap.addAttribute("msg", "Invalid username or password . Please try again.");
		}
		return "login/login";	
	}
	
	
	
	
	
}








































