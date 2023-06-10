package com.denys_panasiuk.emergency_notification_system.model.response_model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto {
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
