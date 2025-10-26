package by.shift.notification.resolver;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.factory.impl.ConcreteSenderFactory;
import by.shift.notification.sender.NotificationSender;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;


public class SenderResolver {

    private final EnumSet<NotificationType> notificationType;

    private final SenderStorage senderStorage = new SenderStorage();

    public SenderResolver(EnumSet<NotificationType> notificationType) {
        this.notificationType = notificationType;
    }

    public AbstractSenderFactory getSenderFactory() {
        List<NotificationSender> factoryList = new ArrayList<>();

        notificationType.forEach(n -> {
            if (senderStorage.getNotificationSenders().containsKey(n)) {
                factoryList.add(senderStorage.getNotificationSenders().get(n));
            }
        });
        return new ConcreteSenderFactory(factoryList);
    }
}
