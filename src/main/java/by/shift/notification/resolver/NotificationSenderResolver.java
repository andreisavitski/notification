package by.shift.notification.resolver;

import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;

public class NotificationSenderResolver {

    private final AbstractSenderFactory abstractSenderFactory;

    public NotificationSenderResolver(AbstractSenderFactory abstractSenderFactory) {
        this.abstractSenderFactory = abstractSenderFactory;
    }

    public NotificationSender getNotificationSender() {
        return abstractSenderFactory.createNotificationSender();
    }
}
