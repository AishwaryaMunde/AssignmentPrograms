package com.bridgelabz.utility;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail
{
	public static void emailSend()
	{
		final String fromEmail = "aishwarya.munde14@gmail.com"; //requires valid gmail id
		final String password = "Aishu1410"; // correct password for gmail id
		final String toEmail = "kccaishwarya2012@gmail.com"; // can be any email id 
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); 
		props.put("mail.smtp.port", "587"); 
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");			
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);			
			}
		};		
		Session session = Session.getInstance(props, auth);		
		try
	    {
	      MimeMessage msg = new MimeMessage(session);	    
	      msg.setFrom(new InternetAddress("no_reply@example.com", "NoReply-JD"));
	      msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));
	      msg.setSubject("Aishwarya", "UTF-8");
	      msg.setText("http://localhost:8081/LoginMvc/index.jsp", "UTF-8");
	      msg.setSentDate(new Date());
	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
	      System.out.println("Message is ready");
	      Transport.send(msg);  
	      System.out.println("Email Sent Successfully!!");
		  }
		  catch (Exception e) {
		      e.printStackTrace();
		  }	
	}
}