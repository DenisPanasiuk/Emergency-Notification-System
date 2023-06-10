package com.denys_panasiuk.emergency_notification_system.service;

import com.denys_panasiuk.emergency_notification_system.model.Contact;

import java.util.List;

public interface ContactService {
    void save(Contact contact);

    List<Contact> findAllByUser_id(String user_id);

    void deleteContact(String id);

    void deleteAllContactsByUser_id(String id);
}
