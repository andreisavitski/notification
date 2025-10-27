package by.shift.notification.factory;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;

import java.util.Map;

public interface AbstractSenderFactory {

    Map<NotificationType, NotificationSender> getNotificationSenders();

}
