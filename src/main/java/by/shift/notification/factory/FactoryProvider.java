package by.shift.notification.factory;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.impl.EmailSenderFactory;
import by.shift.notification.factory.impl.SmsSenderFactory;
import by.shift.notification.factory.impl.TelegramSenderFactory;

import java.util.Map;

import static by.shift.notification.enums.NotificationType.EMAIL;
import static by.shift.notification.enums.NotificationType.SMS;
import static by.shift.notification.enums.NotificationType.TELEGRAM;

public class FactoryProvider {

    private final Map<NotificationType, AbstractSenderFactory> notificationSenders = Map.of(
            EMAIL, new EmailSenderFactory(),
            TELEGRAM, new TelegramSenderFactory(),
            SMS, new SmsSenderFactory()
    );

    public AbstractSenderFactory getSenderFactory(NotificationType notificationType) {
        return notificationSenders.get(notificationType);
    }
}
