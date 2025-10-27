package by.shift.notification;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.factory.FactoryProvider;
import by.shift.notification.resolver.NotificationSenderResolver;
import by.shift.notification.sender.NotificationSender;

import java.util.EnumSet;
import java.util.List;

import static by.shift.notification.enums.NotificationType.EMAIL;
import static by.shift.notification.enums.NotificationType.SMS;
import static by.shift.notification.enums.NotificationType.TELEGRAM;

public class NotificationApplication {

    public static void main(String[] args) {
        EnumSet<NotificationType> notificationTypes = EnumSet.of(SMS, TELEGRAM, EMAIL);

        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractSenderFactory senderFactory = factoryProvider.getSenderFactory(notificationTypes);

        NotificationSenderResolver notificationSenderResolver = new NotificationSenderResolver(senderFactory);
        List<NotificationSender> notificationSenderList = notificationSenderResolver.getNotificationSenders();

        notificationSenderList.forEach(NotificationSender::send);
    }

}