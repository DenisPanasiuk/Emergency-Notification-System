package com.denys_panasiuk.emergency_notification_system.dao;

import com.denys_panasiuk.emergency_notification_system.model.User;
import lombok.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserDao extends MongoRepository<User, String> {
    Optional<User> findUserByUsername(String username);

    void deleteById(@NonNull String id);

    Optional<User> findUserById(String id);
}
