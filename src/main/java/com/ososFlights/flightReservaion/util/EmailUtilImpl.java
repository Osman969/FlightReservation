package com.ososFlights.flightReservaion.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl  {
	
	@Value("${com.elhagez.flightreservaion.itinerary.email.body}")
	private String EMAIL_BODY ;
	@Value("${com.elhagez.flightreservaion.itinerary.email.subject}")
	private String EMAIL_SUBJECT ;

	@Autowired
	private JavaMailSender sender;
		
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailUtilImpl.class);

	
	public void sendEmail(String toAddress, String filepath) {
		LOGGER.info("Inside sendEmail:");
	    MimeMessage message = sender.createMimeMessage();
	   
	    try {
	    	 MimeMessageHelper helper = new MimeMessageHelper(message,true);
			helper.setTo(toAddress);
			helper.setSubject(EMAIL_SUBJECT);
			helper.setText(EMAIL_BODY);
			helper.addAttachment("Itinearary", new File(filepath));
			sender.send(message);
		} catch (MessagingException e) {
			
			LOGGER.error("Exception Inside sendEmail:"+e);

		}
		
				
	}

}
