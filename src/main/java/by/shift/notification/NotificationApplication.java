package by.shift.notification;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.resolver.SenderService;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.resolver.SenderResolver;
import by.shift.notification.utils.Utility;

import java.util.EnumSet;
import java.util.List;

import static by.shift.notification.enums.NotificationType.*;

public class NotificationApplication {

    public static void main(String[] args) {

        //Случайное значение типа нотификации. Иммитирует желание пользователя получить сообщение определенным типом
        NotificationType type = Utility.getRandomNotificationType();
        System.out.println("notificationType: " + type);

        // Иммитация требований бизнеса по ограничению возможности получения нотификации
        EnumSet<NotificationType> notificationTypes = EnumSet.of(SMS, EMAIL);

        SenderService service = new SenderService();

        AbstractSenderFactory factory = new SenderResolver(notificationTypes).getSenderFactory();

        List<NotificationSender> notificationSenderList = factory.getNotificationSenders();

        service.sendNotification(notificationSenderList, type);
    }
}