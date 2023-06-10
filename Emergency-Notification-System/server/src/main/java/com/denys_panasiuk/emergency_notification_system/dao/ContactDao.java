package com.denys_panasiuk.emergency_notification_system.dao;

import com.denys_panasiuk.emergency_notification_system.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ContactDao extends MongoRepository<Contact, String> {
    List<Contact> findAll();

    List<Contact> findAllByUser_id(String user_id);

    void deleteAllByUser_id(String id);

    void deleteById(String id);
}
