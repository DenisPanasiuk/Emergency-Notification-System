package com.denys_panasiuk.emergency_notification_system.service;

import com.denys_panasiuk.emergency_notification_system.model.User;

public interface UserService {
    void save(User user);

    User findUserByUsername(String username);

    User findUserById(String id);

    void deleteUser(String id);
}
