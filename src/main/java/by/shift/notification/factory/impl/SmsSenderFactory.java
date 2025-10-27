package by.shift.notification.factory.impl;

import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.sender.impl.SmsSender;

import java.util.List;

public class SmsSenderFactory implements AbstractSenderFactory {

    @Override
    public List<NotificationSender> createNotificationSenders() {
        return List.of(new SmsSender());
    }
}
