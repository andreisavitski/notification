package by.shift.notification;

import by.shift.notification.enums.NotificationType;
import by.shift.notification.resolver.DefaultStorage;
import by.shift.notification.resolver.SenderResolver;
import by.shift.notification.sender.NotificationSender;
import by.shift.notification.utils.RandomUtil;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class NotificationApplication {

    private static final Logger logger = getLogger(NotificationApplication.class);

    public static void main(String[] args) {

        NotificationType notificationType = RandomUtil.getRandomNotificationType();
        logger.info("Сгенерирован notificationType: {}", notificationType);

        SenderResolver senderResolver = new SenderResolver(new DefaultStorage());
        NotificationSender notificationSender = senderResolver.getSender(notificationType);
        notificationSender.send();
    }
}