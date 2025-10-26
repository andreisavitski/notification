package by.shift.notification.factory.impl;

import by.shift.notification.factory.AbstractSenderFactory;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.sender.impl.EmailSender;
import by.shift.notification.sender.impl.SmsSender;
import by.shift.notification.sender.impl.TelegramSender;

import java.util.List;

public class SmsEmailTelegramSenderFactory implements AbstractSenderFactory {

    @Override
    public List<NotificationSender> createNotificationSenders() {
        return List.of(new SmsSender(), new EmailSender(),  new TelegramSender());
    }
}
