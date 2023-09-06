package com.james.eventbooking_hub.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public abstract class VerificationBaseEntity extends BaseEntity{
    private String token;
    private Date expirationTime;
}
