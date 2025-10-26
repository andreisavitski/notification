package by.shift.notification;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.factory.FactoryProvider;
import by.shift.notification.resolver.NotificationSenderResolver;
import by.shift.notification.sender.NotificationSender;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

import static by.shift.notification.enums.NotificationType.*;

public class NotificationApplication {

    public static void main(String[] args) {

        NotificationType notificationType = getRandomNotificationType();
        System.out.println("notificationType: " + notificationType);

        EnumSet<NotificationType> notificationTypes = EnumSet.of(SMS, EMAIL);

        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractSenderFactory senderFactory = factoryProvider.getSenderFactory(notificationTypes);

        NotificationSenderResolver notificationSenderResolver = new NotificationSenderResolver(senderFactory);
        List<NotificationSender> notificationSenderList = notificationSenderResolver.getNotificationSenders();

        notificationSenderList.stream()
                .filter(l -> notificationType.equals(l.get()))
                .findFirst()
                .ifPresentOrElse(
                        NotificationSender::send,
                        () -> System.out.println("This type of notification " + notificationType + " is prohibited")
                );
    }

    private static NotificationType getRandomNotificationType() {
        Random random = new Random();
        NotificationType[] types = NotificationType.values();
        return types[random.nextInt(types.length)];
    }

}