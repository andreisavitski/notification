package by.shift.notification;

import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.factory.FactoryProvider;
import by.shift.notification.resolver.NotificationSenderResolver;

import static by.shift.notification.enums.NotificationType.EMAIL;

public class NotificationApplication {

    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractSenderFactory senderFactory = factoryProvider.getSenderFactory(EMAIL);
        NotificationSenderResolver notificationSenderResolver = new NotificationSenderResolver(senderFactory);
        notificationSenderResolver.getNotificationSender().send();
    }
}