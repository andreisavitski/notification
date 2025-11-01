package by.shift.notification.utils;

import by.shift.notification.enums.NotificationType;

import java.util.Random;

public final class RandomUtil {

    private RandomUtil() {
    }

    public static NotificationType getRandomNotificationType() {
        Random random = new Random();
        NotificationType[] types = NotificationType.values();
        return types[random.nextInt(types.length)];
    }
}
