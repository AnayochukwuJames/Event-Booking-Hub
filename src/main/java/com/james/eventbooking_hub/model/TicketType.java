package com.james.eventbooking_hub.model;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TicketType extends BaseEntity{
    @ManyToOne
    private Event event;
    private String category;
    private int quantity;
    private Double cost;
}
