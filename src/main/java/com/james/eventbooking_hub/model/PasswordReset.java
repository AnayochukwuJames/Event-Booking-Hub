package com.decagon.eventbookingsq16.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
public class PasswordReset extends VerificationBaseEntity{
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
