package com.aug.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	private static final String from = "lncc.clan@yahoo.com"; //LNCC visible trash email
	private static final String pass = "Cj167455";
	private static final String host = "smtp.mail.yahoo.com";
	private static final String port = "587";
	
	
	
	public static void sendMail(String to, String subject, String text) {

	   // Get system properties
	   Properties properties = System.getProperties();
	   
	   // Setup mail server
	   properties.put("mail.smtp.starttls.enable", "true");
	   properties.put("mail.smtp.host", host);
	   properties.put("mail.smtp.user", from);
	   properties.put("mail.smtp.password", pass);
	   properties.put("mail.smtp.port", port);
	   properties.put("mail.smtp.auth", "true");

	   // Get the default Session object.
	   Session session = Session.getDefaultInstance(properties);

	   try{
	      // Create a default MimeMessage object.
	      MimeMessage message = new MimeMessage(session);

	      // Set From: header field of the header.
	      message.setFrom(new InternetAddress(from));

	      // Set To: header field of the header.
	      message.addRecipient(Message.RecipientType.TO,
	                               new InternetAddress(to));

	      // Set Subject: header field
	      message.setSubject(subject);

	      // Now set the actual message
	      message.setText(text);

	      // Send message
	      Transport transport = session.getTransport("smtp");
	      transport.connect(host, from, pass);
	      transport.sendMessage(message, message.getAllRecipients());
	      transport.close();
	      System.out.println("Sent message successfully....");
	   }catch (MessagingException mex) {
	      mex.printStackTrace();
	   }
		
	}

}
