package by.shift.notification.factory.impl;

import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.sender.impl.TelegramSender;

public class TelegramSenderFactory implements AbstractSenderFactory {

    @Override
    public NotificationSender createNotificationSender() {
        return new TelegramSender();
    }
}
