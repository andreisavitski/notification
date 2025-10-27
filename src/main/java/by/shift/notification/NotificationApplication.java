package by.shift.notification;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.resolver.SenderResolver;
import by.shift.notification.utils.Utility;

import java.util.EnumSet;
import java.util.List;

import static by.shift.notification.enums.NotificationType.*;

public class NotificationApplication {

    public static void main(String[] args) {

        Utility utility = new Utility();

        NotificationType type = utility.getRandomNotificationType();
        System.out.println("notificationType: " + type);

        EnumSet<NotificationType> notificationTypes = EnumSet.of(SMS, EMAIL);

        AbstractSenderFactory factory = new SenderResolver(notificationTypes).getSenderFactory();

        List<NotificationSender> notificationSenderList = factory.getNotificationSenders();

        utility.sendNotification(notificationSenderList, type);
    }
}