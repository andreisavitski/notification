package by.shift.notification.sender.impl;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

public class TelegramSender implements NotificationSender {

    private final static NotificationType notificationType = NotificationType.TELEGRAM;

    @Override
    public void send() {
        System.out.println("Sending " + notificationType);
    }

    @Override
    public NotificationType get() {
        return notificationType;
    }
}
