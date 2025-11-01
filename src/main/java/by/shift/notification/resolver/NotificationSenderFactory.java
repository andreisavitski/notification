package by.shift.notification.resolver;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

import java.util.Map;

public interface NotificationSenderFactory {

    Map<NotificationType, NotificationSender> getNotificationSenders();
}
