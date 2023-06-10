package com.denys_panasiuk.emergency_notification_system.common.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}