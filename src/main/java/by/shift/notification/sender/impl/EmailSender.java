package by.shift.notification.sender.impl;

import by.shift.notification.sender.NotificationSender;

public class EmailSender implements NotificationSender {

    @Override
    public void send() {
        System.out.println("Sending EMAIL");
    }
}
