package com.james.eventbooking_hub.repository;

import com.james.eventbooking_hub.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom query method to find events by category
    List<Event> findByCategory(String category);
}
