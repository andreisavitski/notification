package by.shift.notification.factory;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.impl.SmsEmailSenderFactory;
import by.shift.notification.factory.impl.SmsEmailTelegramSenderFactory;
import by.shift.notification.factory.impl.SmsSenderFactory;

import java.util.EnumSet;
import java.util.Map;

import static by.shift.notification.enums.NotificationType.EMAIL;
import static by.shift.notification.enums.NotificationType.SMS;
import static by.shift.notification.enums.NotificationType.TELEGRAM;

public class FactoryProvider {

    private final Map<EnumSet<NotificationType>, AbstractSenderFactory> notificationSenders = Map.of(
            EnumSet.of(SMS), new SmsSenderFactory(),
            EnumSet.of(SMS ,EMAIL), new SmsEmailSenderFactory(),
            EnumSet.of(SMS, EMAIL, TELEGRAM), new SmsEmailTelegramSenderFactory()
    );

    public AbstractSenderFactory getSenderFactory(EnumSet<NotificationType> notificationType) {
        return notificationSenders.get(notificationType);
    }
}
