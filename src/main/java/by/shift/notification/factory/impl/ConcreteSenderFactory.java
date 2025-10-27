package by.shift.notification.factory.impl;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;

import java.util.Map;

public class ConcreteSenderFactory implements AbstractSenderFactory {

    private final Map<NotificationType, NotificationSender> notificationSenders;

    public ConcreteSenderFactory(Map<NotificationType, NotificationSender> notificationSenders) {
        this.notificationSenders = notificationSenders;
    }

    @Override
    public Map<NotificationType, NotificationSender> getNotificationSenders() {
        return notificationSenders;
    }
}
