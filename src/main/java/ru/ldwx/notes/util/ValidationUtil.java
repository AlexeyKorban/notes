package ru.ldwx.notes.util;

import ru.ldwx.notes.util.exception.NotFoundException;

public class ValidationUtil {

    private ValidationUtil() {
    }

    public static <T> T checkNotFound(T object, String msg) {
        checkNotFound(object != null, msg);
        return object;
    }

    public static void checkNotFound(boolean found, String msg) {
        if (!found) {
            throw new NotFoundException("Not found entity with " + msg);
        }
    }
}
