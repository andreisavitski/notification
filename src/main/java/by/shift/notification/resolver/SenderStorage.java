package by.shift.notification.resolver;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.sender.impl.EmailSender;
import by.shift.notification.sender.impl.SmsSender;
import by.shift.notification.sender.impl.TelegramSender;

import java.util.Map;

import static by.shift.notification.enums.NotificationType.*;

public class SenderStorage {

    private final Map<NotificationType, NotificationSender> notificationSenders = Map.of(
            EMAIL, new EmailSender(),
            TELEGRAM, new TelegramSender(),
            SMS, new SmsSender()
    );

    public Map<NotificationType, NotificationSender> getNotificationSenders() {
        return notificationSenders;
    }
}
