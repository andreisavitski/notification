package by.shift.notification.resolver;

import by.shift.notification.decorator.NotificationSenderLoggerDecorator;
import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

import java.util.Map;


public class SenderResolver {

    private final Map<NotificationType, NotificationSender> notificationSenders;

    public SenderResolver(NotificationSenderFactory notificationSenderFactory) {
        this.notificationSenders = notificationSenderFactory.getNotificationSenders();

    }

    public NotificationSender getSender(NotificationType type) {
        return new NotificationSenderLoggerDecorator(notificationSenders.get(type));
    }
}
