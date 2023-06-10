package com.denys_panasiuk.emergency_notification_system.service;

import com.denys_panasiuk.emergency_notification_system.model.response_model.ContactDto;
import com.denys_panasiuk.emergency_notification_system.model.response_model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class EmergencyRestServiceImp implements EmergencyRestService{

    @Autowired
    private WebClient webClient;

    @Override
    public UserDto getUserByUsername(String username) {
        return null;
    }

    @Override
    public ContactDto getContactDtoById(String id) {
        return null;
    }

    @Override
    public List<ContactDto> getListOfContactsByUser_id(String user_id) {
        return null;
    }
}
