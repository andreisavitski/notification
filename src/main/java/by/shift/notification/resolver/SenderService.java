package by.shift.notification.resolver;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

import java.util.Map;

public class SenderService {

    public void sendNotification(Map<NotificationType, NotificationSender> notificationSenderMap, NotificationType type) {
        if (notificationSenderMap.containsKey(type)) {
            notificationSenderMap.get(type).send();
        } else {
            System.out.println("This type of notification " + type + " is prohibited");
        }
    }
}
