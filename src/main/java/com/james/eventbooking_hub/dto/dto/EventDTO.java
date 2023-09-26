package com.james.eventbooking_hub.dto.dto;

import com.james.eventbooking_hub.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventDTO {
    private Long id;
    private String eventTitle;
    private String eventDescription;
    private String location;
    private String category;
    private String bannerPath;
    private String organizer;
    private int availableTicket;
    private int ticketSold;
    private double revenueGenerated;
    private Date startDateTime;
    private Date endDateTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean published;



}
