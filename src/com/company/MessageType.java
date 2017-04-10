package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Elena Hardon
 * @date 4/10/17.
 */
public class MessageType {

    private List<String> messageList = new ArrayList<String>(5);
    private String requestReceived = "This is a request recieved message.";
    private String requestSent = "Your request has been sent";
    private String requestApproved = "Your request has been approved.";
    private String requestDenied = "Your request has been denied.";
    private String requestFinalised = "Your request has been finalised. You can come.";


    public MessageType() {
        messageList.add(requestReceived);
        messageList.add(requestApproved);
        messageList.add(requestDenied);
        messageList.add(requestFinalised);
        messageList.add(requestSent);
    }

    public String getMessage(int type) {
        return messageList.get(type);
    }
}
