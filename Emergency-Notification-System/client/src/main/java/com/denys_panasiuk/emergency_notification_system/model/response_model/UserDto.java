package com.denys_panasiuk.emergency_notification_system.model.response_model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String gmail;
    private String phoneNumber;
}
