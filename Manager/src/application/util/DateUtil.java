package application.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Вспомогательные функции для работы с датами
 */
public class DateUtil {
    /**
     * Шаблон даты, используемый для преобразования. Можно поменять на свой
     */
    private static final String DATE_PATTERN = "dd.MM.yyyy";
    /**
     * Форматировщик даты
     */
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);

    /**
     * - возвращает полученную дату в виде отформатированной строки
     * - используется определённый выше DATE_PATTERN
     * @param date
     * @return отформатированную строку
     */
    public static String formatDate(LocalDate date) {
        if (date == null) {
            return null;
        }
        return DATE_TIME_FORMATTER.format(date);
    }

    public static LocalDate parseDate(String date) {
        if (date == null) {
            return null;
        }
        return LocalDate.parse(date, DATE_TIME_FORMATTER);
    }
}
