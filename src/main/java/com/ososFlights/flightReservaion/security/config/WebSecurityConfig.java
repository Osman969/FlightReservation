package com.ososFlights.flightReservaion.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
	    return super.authenticationManagerBean();
	}
	//@Override
	//protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	//{
	//    auth.parentAuthenticationManager(authenticationManagerBean());
	  //      .userDetailsService(customUserDetailsService);
	//}
	
	
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder() ;
		
	}
	@Override
	public void configure(HttpSecurity http ) throws Exception {
		http.authorizeRequests().antMatchers(
"/showReg","/","/index.html","/registerUser","/login","/showLogin","/login/*")
		.permitAll().antMatchers("admin/showAddFlight").hasAnyAuthority("ADMIN").
		anyRequest().authenticated().and().csrf().disable();
		
	}
}
