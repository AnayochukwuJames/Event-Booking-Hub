package com.james.eventbooking_hub.controller;
import com.james.eventbooking_hub.model.User;
import com.james.eventbooking_hub.service.MailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/")
public class MailController {
    private final MailService mail;

    @PostMapping("send")
    public ResponseEntity<String> sendEmail1(@RequestBody User users) {
        try {
            log.info("i got here " + users.getEmail());
            mail.sendEmail(users.getEmail(), MailService.TEST_SUBJECT, MailService.TEST_CONTENT);
            return ResponseEntity.ok("Email sent Successfully");
        } catch (Exception e) {
            log.info("i'm doing this instead");
            return new ResponseEntity<>(HttpStatusCode.valueOf(401));
        }
    }

}
