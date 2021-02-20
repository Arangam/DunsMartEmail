/**
 * 
 */
package com.dnbi.email;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnbi.email.util.EmailUtils;

/**
 * @author anil_
 *
 */
@RestController
public class DunsEmailController {

	//@Autowired EmailUtils emailUtils;
	
	@RequestMapping(value="/sendEmail") 
	public String sendEmail() throws AddressException, MessagingException, IOException
	{
		EmailUtils.sendEmail();
		return "Email Sent Successfully....";
		
	}
	/*@Bean
	public EmailUtils emailUtils()
	{
		return emailUtils;
	}*/
}
	
