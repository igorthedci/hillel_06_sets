import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class task_10_day_of_week {
    /**
     * "10. Create enum for days of the week.
     * Write a program which will be printing the number of a day according to day of the week.
     * Example:
     * If today is Sunday - print 1;
     * If today is Monday - print 2
     * ..."
     * 1) Use switch(day of the week) to pass the day of the week.
     */
// the ENUM is defined as DayOfWeek
//    enum DayWeek {
//        SUNDAY,
//        MONDAY,
//        TUESDAY,
//        WEDNESDAY,
//        THURSDAY,
//        FRIDAY,
//        SATURDAY
//    }
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek aDay = today.getDayOfWeek();

        System.out.println("Today is " + today);
        System.out.println(aDay + " - " + aDay.getValue());
    }
}
