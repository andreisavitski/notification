package by.shift.notification.utils;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

import java.util.List;
import java.util.Random;

public class Utility {

    public NotificationType getRandomNotificationType() {
        Random random = new Random();
        NotificationType[] types = NotificationType.values();
        return types[random.nextInt(types.length)];
    }

    public void sendNotification(List<NotificationSender> notificationSenderList, NotificationType notificationType) {
        notificationSenderList.stream()
                .filter(l -> notificationType.equals(l.get()))
                .findFirst()
                .ifPresentOrElse(
                        NotificationSender::send,
                        () -> System.out.println("This type of notification " + notificationType + " is prohibited")
                );
    }
}
