package by.shift.notification.sender.impl;

import by.shift.notification.sender.NotificationSender;

public class SmsSender implements NotificationSender {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}
