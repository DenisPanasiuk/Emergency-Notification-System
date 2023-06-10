package com.denys_panasiuk.emergency_notification_system.service;

import com.denys_panasiuk.emergency_notification_system.common.exception.NotFoundException;
import com.denys_panasiuk.emergency_notification_system.dao.ContactDao;
import com.denys_panasiuk.emergency_notification_system.dao.UserDao;
import com.denys_panasiuk.emergency_notification_system.model.User;

import java.text.MessageFormat;
import java.util.Optional;

public class UserServiceImp implements UserService{
    private UserDao userDao;
    private ContactDao contactDao;

    public UserServiceImp(UserDao userDao, ContactDao contactDao) {
        this.userDao = userDao;
        this.contactDao = contactDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findUserByUsername(String username) {
        Optional<User> optionalUser = userDao.findUserByUsername(username);
        if (optionalUser.isEmpty()) throw new NotFoundException(String.format("User with username %s not found", username));
        else {
            return optionalUser.get();
        }
    }

    @Override
    public User findUserById(String id) {
        Optional<User> optionalUser = userDao.findUserById(id);
        if (optionalUser.isEmpty()) throw new RuntimeException();
        else {
            return optionalUser.get();
        }
    }

    @Override
    public void deleteUser(String id) {
        userDao.deleteById(id);
        contactDao.deleteAllByUser_id(id);
    }
}
