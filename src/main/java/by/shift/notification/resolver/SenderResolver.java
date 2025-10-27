package by.shift.notification.resolver;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.factory.impl.ConcreteSenderFactory;
import by.shift.notification.sender.NotificationSender;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;


public class SenderResolver {

    private final EnumSet<NotificationType> notificationType;

    private final SenderStorage senderStorage = new SenderStorage();

    public SenderResolver(EnumSet<NotificationType> notificationType) {
        this.notificationType = notificationType;
    }

    public AbstractSenderFactory getSenderFactory() {
        Map<NotificationType, NotificationSender> factoryMap = new HashMap<>();
        Map<NotificationType, NotificationSender> senderStorageMap = senderStorage.getNotificationSenders();

        notificationType.forEach(n -> {
            if (senderStorageMap.containsKey(n)) {
                factoryMap.put(n, senderStorageMap.get(n));
            }
        });
        return new ConcreteSenderFactory(factoryMap);
    }
}
