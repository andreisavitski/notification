package by.shift.notification.sender.impl;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

public class SmsSender implements NotificationSender {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }
}
