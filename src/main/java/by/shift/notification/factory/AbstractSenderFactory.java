package by.shift.notification.factory;

import by.shift.notification.sender.NotificationSender;

public interface AbstractSenderFactory {

    NotificationSender createNotificationSender();
}
