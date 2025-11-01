package by.shift.notification.decorator;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.sender.NotificationSender;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class NotificationSenderLoggerDecorator implements NotificationSender {

    private final NotificationSender notificationSender;

    private static final Logger logger = getLogger(NotificationSenderLoggerDecorator.class);

    public NotificationSenderLoggerDecorator(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send() {
        logger.info("Начало отправки {}", getType());
        notificationSender.send();
        logger.info("Конец отправки {}", getType());
    }

    @Override
    public NotificationType getType() {
        return notificationSender.getType();
    }
}
