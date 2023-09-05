package com.decagon.eventbookingsq16.model;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Ticket extends BaseEntity{
    private String fullName;
    private String email;
    private String phoneNumber;
    private String ticketType;
    private int ticketNumber;
    @ManyToOne
    private Event event;

}
