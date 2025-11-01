package by.shift.notification.resolver;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.sender.impl.EmailSender;
import by.shift.notification.sender.impl.SmsSender;
import by.shift.notification.sender.impl.TelegramSender;

import java.util.Map;

import static by.shift.notification.enums.NotificationType.EMAIL;
import static by.shift.notification.enums.NotificationType.SMS;
import static by.shift.notification.enums.NotificationType.TELEGRAM;

public class DefaultStorage implements NotificationSenderFactory {

    private final Map<NotificationType, NotificationSender> notificationSenders = Map.of(
            EMAIL, new EmailSender(),
            TELEGRAM, new TelegramSender(),
            SMS, new SmsSender()
    );

    @Override
    public Map<NotificationType, NotificationSender> getNotificationSenders() {
        return notificationSenders;
    }
}
