package by.shift.notification.factory.impl;

import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;

import java.util.List;

public class ConcreteSenderFactory implements AbstractSenderFactory {

    private final List<NotificationSender> notificationSenders;

    public ConcreteSenderFactory(List<NotificationSender> notificationSenders) {
        this.notificationSenders = notificationSenders;
    }

    @Override
    public List<NotificationSender> getNotificationSenders() {
        return notificationSenders;
    }
}
