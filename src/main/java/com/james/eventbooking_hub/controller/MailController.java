package com.james.eventbooking_hub.controller;
import com.james.eventbooking_hub.model.Users;
import com.james.eventbooking_hub.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.james.eventbooking_hub.service.MailService.TEST_SUBJECT;

@AllArgsConstructor
@Controller
@RequestMapping("/")
public class MailController {
    private final MailService mail;

    @PostMapping("/")
    public ResponseEntity<String> sendEmail(@RequestBody Users users) {
        try {
            mail.sendEmail(users.getEmail(), MailService.TEST_SUBJECT, MailService.TEST_CONTENT);
            return ResponseEntity.ok("Email sent Successfully");
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }
}
