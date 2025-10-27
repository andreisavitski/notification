package by.shift.notification.resolver;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

import java.util.List;

public class SenderService {

    public void sendNotification(List<NotificationSender> notificationSenderList, NotificationType notificationType) {
        notificationSenderList.stream()
                .filter(l -> notificationType.equals(l.getNotificationType()))
                .findFirst()
                .ifPresentOrElse(
                        NotificationSender::send,
                        () -> System.out.println("This type of notification " + notificationType + " is prohibited")
                );
    }
}
