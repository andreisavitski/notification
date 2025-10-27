package by.shift.notification.sender.impl;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

public class EmailSender implements NotificationSender {

    private final static NotificationType notificationType = NotificationType.EMAIL;

    @Override
    public void send() {
        System.out.println("Sending " + notificationType);
    }

    @Override
    public NotificationType getNotificationType() {
        return notificationType;
    }
}
