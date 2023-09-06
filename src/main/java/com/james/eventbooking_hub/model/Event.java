package com.james.eventbooking_hub.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class Event extends BaseEntity {
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
