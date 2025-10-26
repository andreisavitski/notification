package by.shift.notification.sender;

import by.shift.notification.enums.NotificationType;

public interface NotificationSender {

    void send();
    NotificationType get();
}
