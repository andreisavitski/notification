package by.shift.notification.factory;

import by.shift.notification.sender.NotificationSender;

import java.util.List;

public interface AbstractSenderFactory {

    List<NotificationSender> createNotificationSenders();

}
