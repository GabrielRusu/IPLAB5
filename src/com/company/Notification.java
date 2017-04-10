package com.company;

import java.util.List;

/**
 * @author Elena Hardon
 * @date 4/10/17.
 */
public class Notification implements SendNotification {

    private MessageType messageType = new MessageType();
    private static Notification notificationInstance;
    public static Notification Instance = new Notification();

    private List<UserTuple> studentsEmailList;


    private Notification() {
    }


    public List<UserTuple> getStudentsEmailList() {
        return studentsEmailList;
    }

    public void setStudentsEmailList(List<UserTuple> studentsEmailList) {
        this.studentsEmailList = studentsEmailList;
    }

    public void sendSms(long userId, UserType userType, Integer messageId) {
        System.out.println(userType.toString() + "with id: " + userId + "has received the message: "
                + messageType.getMessage(messageId));
    }

    public void sendEmail(long userId, UserType userType, Integer messageId) {
        System.out.println(userType.toString() + "with id: " + userId + "has received the e-mail: "
                + messageType.getMessage(messageId));
    }
}
