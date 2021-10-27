package model;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * Class MyExceptions:
 * Extends Exception.
 * Used for personalized exception handling.
 * Uses a variety of personalized methods for the various kinds of errors generated in the code.
 * Checks:
 *      -Employee IDs.
 *      -Dates.
 *      -Salaries.
 */

import model.*;

public class MyExceptions extends Exception{
    
    public MyExceptions(int errorCode) {
        /**
         * Shows on console which error ocurred
         */
        switch(errorCode) {
            case 1 -> {
                invalidDateMessage();
            }
            case 2 -> {
                invalidSalaryMessage();
            }
            case 3 -> {
                invalidIDMessage();
            }
            
        }
    }
    
    public MyExceptions(String message){super (message);}

    public static void checkDate(String date) throws MyExceptions {
        /**
         * Checks a string to see if it has a correct format to convert it to a GregorianCalendar using
         * DateParser.parseDate(string).
         * The correct format is: "DD/MM/YYYY"
         */
        if( !(date.matches("\\d{2}/\\d{2}/\\d{4}")) )
            throw new MyExceptions(1);
    }

    public static void checkSalary(float salary) throws MyExceptions {
        /**
         * Checks if the given float is a valid salary in the Employee class context.
         * A valid salary is a float that is above 0f and below the maxSalary variable.
         */
        if (salary > Employee.maxSalary)
            throw new MyExceptions(2);
    }

    public static void checkID(int id) throws MyExceptions {
        /**
         * Checks if the given int is a valid ID in the Employee class context.
         * A valid ID is an int that is not already assigned to another Employee object as the id attribute.
         * This means that the ID is UNIQUE for each Employee object.
         */
    }

    public static void invalidDateMessage() {
        /**
         * Shows an error message for when the format of the date string, or the values of the fields in the date string
         * are invalid.
         */
    }

    public static void invalidSalaryMessage() {
        /**
         * Shows an error message for when the salary is invalid.
         */
    }

    public static void invalidIDMessage() {
        /**
         * Shows an error message for when the ID is invalid.
         */
    }

    public void showMessage() {
        /**
         * Show the full traceback of the exception.
         */
        System.out.println(this.getMessage());
    }
}