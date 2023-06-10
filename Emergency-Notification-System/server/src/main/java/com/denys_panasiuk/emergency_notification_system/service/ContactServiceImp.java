package com.denys_panasiuk.emergency_notification_system.service;

import com.denys_panasiuk.emergency_notification_system.dao.ContactDao;
import com.denys_panasiuk.emergency_notification_system.dao.UserDao;
import com.denys_panasiuk.emergency_notification_system.model.Contact;

import java.util.List;

public class ContactServiceImp implements ContactService {
    private UserDao userDao;
    private ContactDao contactDao;

    public ContactServiceImp(UserDao userDao, ContactDao contactDao) {
        this.userDao = userDao;
        this.contactDao = contactDao;
    }

    @Override
    public void save(Contact contact) {
        contactDao.save(contact);
    }

    @Override
    public List<Contact> findAllByUser_id(String user_id) {
        return contactDao.findAllByUser_id(user_id);
    }

    @Override
    public void deleteContact(String id) {
        contactDao.deleteById(id);
    }

    @Override
    public void deleteAllContactsByUser_id(String id) {
        contactDao.deleteAllByUser_id(id);
    }
}
