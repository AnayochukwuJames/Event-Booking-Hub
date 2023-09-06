package com.james.eventbooking_hub.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class MailService {
    private final JavaMailSender javaMailSender;
    public static final String TEST_CONTENT="Welcome to Event Booking Nig LTD.";
    public static final String TEST_SUBJECT="Please confirm your Booking details for your Event Ticket";
    public void sendEmail(String toEmail, String subject, String content){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        javaMailSender.send(mailMessage);


    }
}


