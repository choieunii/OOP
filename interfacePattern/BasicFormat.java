package interfacePattern;
/*2018112021 최은지*/
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;

/**
 * Specifies basic formatting for dates, integers, money, and people
 */
public class BasicFormat {
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(date);
    }
    /**
     * Formats a date
     *
     * @param year  Full integral value of the year, e.g. 1945, 2008
     * @param month Zero-based month index, e.g. 0 is January, 6 is July
     * @param day   One-based day of the month
     */
    public static String formatDate(int year, int month, int day) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(new GregorianCalendar(year, month, day).getTime());
    }

    public static String formatLong(long number) {
        DecimalFormat intFormat = new DecimalFormat("#,###");
        return intFormat.format(number);
    }

    public static String formatMoney(double amount) {
        DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
        return dollarFormat.format(amount);
    }

    public static String formatPerson(String firstName, String lastName, String userName) {
        MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");
        return personFormat.format(new Object[]{firstName, lastName, userName});
    }
}
