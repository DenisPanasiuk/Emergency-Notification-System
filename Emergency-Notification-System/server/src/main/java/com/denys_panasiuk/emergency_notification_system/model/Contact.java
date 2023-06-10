package com.denys_panasiuk.emergency_notification_system.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Document(value = "Contact")
@Getter
@Setter
@Builder
public class Contact {
    @Id
    private String id;
    private String user_id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String telegram;
    private String whatsApp;
    private String viber;
    private String gmail;
}
