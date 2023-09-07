package com.james.eventbooking_hub.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender javaMailSender;
    public static final String TEST_CONTENT="Please confirm your Booking details for your Event Ticket";
    public static final String TEST_SUBJECT="Welcome to Event Booking Nig LTD.";
    public void sendEmail(String toEmail, String subject, String content){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        log.info("I will send email");
        javaMailSender.send(mailMessage);
    }
}


