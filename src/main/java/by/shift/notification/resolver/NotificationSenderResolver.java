package by.shift.notification.resolver;

import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;

import java.util.List;

public class NotificationSenderResolver {

    private final AbstractSenderFactory abstractSenderFactory;

    public NotificationSenderResolver(AbstractSenderFactory abstractSenderFactory) {
        this.abstractSenderFactory = abstractSenderFactory;
    }

    public List<NotificationSender> getNotificationSenders() {
        return abstractSenderFactory.createNotificationSenders();
    }
}
