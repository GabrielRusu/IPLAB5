package com.company;

/**
 * @author Elena Hardon
 * @date 4/10/17.
 */
public interface SendNotification {

    void sendSms(long userId, UserType userType, Integer messageType);

    void sendEmail(long userId, UserType userType, Integer messageType);
}
