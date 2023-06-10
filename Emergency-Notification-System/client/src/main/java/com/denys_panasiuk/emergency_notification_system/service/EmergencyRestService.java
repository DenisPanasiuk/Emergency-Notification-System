package com.denys_panasiuk.emergency_notification_system.service;

import com.denys_panasiuk.emergency_notification_system.model.response_model.ContactDto;
import com.denys_panasiuk.emergency_notification_system.model.response_model.UserDto;

import java.util.List;

public interface EmergencyRestService {
    UserDto getUserByUsername(String username);

    ContactDto getContactDtoById(String id);

    List<ContactDto> getListOfContactsByUser_id(String user_id);
}
