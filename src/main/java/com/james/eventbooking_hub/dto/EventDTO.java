package com.james.eventbooking_hub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventDTO {
    private String eventTitle;
    private String eventDescription;
    private String location;
    private String category;
    private String banner;
    private String organizer;
    private int availableTicket;
    private int ticketSold;
    private Date startDateTime;
    private Date endDateTime;

}
