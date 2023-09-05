package com.decagon.eventbookingsq16.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class EmailVerification extends VerificationBaseEntity {
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
