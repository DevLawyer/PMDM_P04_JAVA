package controller;

import model.MyExceptions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * This class is used to turn String objects to GregorianCalendar objects and
 * vice versa. It also has the tools required to check if a certain amount of
 * time has passed between two dates.
 */
public class DateParser {

    /**
     * A SimpleDateFormat will be used to format Strings.
     */
    static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /*------------------------------------------------------------------------*/
    // Converts from a String to a GregorianCalendar.
    public static GregorianCalendar parseDate(String date) {
        /**
         * Strig parameter must have the following format: DD/MM/YYYY We will
         * use the following constructor from GregorianCalendar
         * GregorianCalendar(int year, int month, int day) To extract the day,
         * month, ad year from the String, we will use the substring() method,
         * and then convert that substring to an int.
         */
        GregorianCalendar cal = null;

        try {
            // First, to check if the string is formatted correctly.
            MyExceptions.checkDate(date);
            // Try to create a GregorianCalendar object.
            cal = new GregorianCalendar(
                    Integer.parseInt(date.substring(6, 10)),
                    Integer.parseInt(date.substring(3, 5)) - 1, // Calendar month is between 0 and 11
                    Integer.parseInt(date.substring(0, 2)));
        } catch (MyExceptions e) {
            // If date string has invalid format:
            e.showMessage();
        } catch (IllegalArgumentException e) {
            // If values are out of range:
            MyExceptions.invalidDateMessage();
        }

        return cal;
    }

    /*------------------------------------------------------------------------*/
    // Converts from GregorianCalendar to String.
    public static String parseDate(GregorianCalendar cal) {
        /**
         * Converts a GregorianCalendar object to a formatted string.
         */
        return toString(cal);
    }

    public static String toString(GregorianCalendar cal) {
        /**
         * Creates a Date object with the same values as the GregorianCalendar
         * parameter. Then, it converts it to a formatted string with
         * SimpleDateFormat and the format() method.
         */
        try {
            Date thisDate = cal.getTime();
            return sdf.format(thisDate);
        } catch (Exception e) {
            // If the date cannot be formatted:
            System.out.println(e.getMessage());
            return null;
        }
    }

    /*------------------------------------------------------------------------*/
    public static boolean passedMonth(GregorianCalendar entryDate) {
        /**
         * Checks whether or not a month has passed between the given date and
         * the current date.
         */
        GregorianCalendar now = new GregorianCalendar();

        int actualYear = now.get(Calendar.YEAR),
                entryYear = now.get(Calendar.YEAR);
        int actualMonth = now.get(Calendar.MONTH),
                entryMonth = entryDate.get(Calendar.MONTH);
        int actualDay = now.get(Calendar.DAY_OF_MONTH),
                entryDay = entryDate.get(Calendar.DAY_OF_MONTH);

        return (((actualMonth + (11 * (actualYear - entryYear))) - entryMonth) >= 1
                && (actualDay >= entryDay));
    }

    /*------------------------------------------------------------------------*/
    public static boolean passedQuarter(GregorianCalendar entryDate) {
        /**
         * Checks whether or not 4 months have passed between the given date and
         * the current date.
         */
        GregorianCalendar now = new GregorianCalendar();

        int actualYear = now.get(Calendar.YEAR),
                entryYear = now.get(Calendar.YEAR);
        int actualMonth = now.get(Calendar.MONTH),
                entryMonth = entryDate.get(Calendar.MONTH);
        int actualDay = now.get(Calendar.DAY_OF_MONTH),
                entryDay = entryDate.get(Calendar.DAY_OF_MONTH);

        return (((actualMonth + (11 * (actualYear - entryYear))) - entryMonth) % 4 == 0
                && (actualDay >= entryDay));
    }

    /*------------------------------------------------------------------------*/
    public static boolean passedYear(GregorianCalendar entryDate) {
        /**
         * Checks whether or not a year has passed between the given date and
         * the current date.
         */
        GregorianCalendar now = new GregorianCalendar();

        int actualYear = now.get(Calendar.YEAR),
                entryYear = now.get(Calendar.YEAR);
        int actualMonth = now.get(Calendar.MONTH),
                entryMonth = entryDate.get(Calendar.MONTH);
        int actualDay = now.get(Calendar.DAY_OF_MONTH),
                entryDay = entryDate.get(Calendar.DAY_OF_MONTH);

        return ((actualYear > entryYear)
                && ((actualMonth + (11 * (actualYear - entryYear))) >= entryMonth)
                && (actualDay >= entryDay));
    }
}
