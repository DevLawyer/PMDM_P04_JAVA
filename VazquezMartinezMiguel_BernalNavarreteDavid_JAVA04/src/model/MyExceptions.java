package model;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * Class MyExceptions: Extends Exception. Used for personalized exception
 * handling. Uses a variety of personalized methods for the various kinds of
 * errors generated in the code. Checks: -Employee IDs. -Dates. -Salaries.
 */

public class MyExceptions extends Exception {

    /*------------------------------------------------------------------------*/
    // Attributes
    private static String message;
    private static String text;

    /*------------------------------------------------------------------------*/
    // Constructor
    public MyExceptions(int errorCode) {
        /**
         * Shows on console which error ocurred
         */
        switch (errorCode) {
            case 1 -> {
                invalidDateMessage();
            }
            case 2 -> {
                invalidSalaryMessage();
            }
            case 3 -> {
                invalidIDMessage();
            }
            case 4 ->{
                invalidNameMessage();
            }
            case 5 ->{
                invalidFieldMessage();
            }

        }
    }

    public MyExceptions(String message) {
        super(message);
    }

    /*------------------------------------------------------------------------*/
    public static void checkID(String id)throws MyExceptions {
        int sal;
        try {
            
            sal = Integer.parseInt(id);

        } catch (Exception ex) {
            throw new MyExceptions(3);
        }
    }
    
    public static boolean checkDate(String date) throws MyExceptions {
        /**
         * Checks a string to see if it has a correct format to convert it to a
         * GregorianCalendar using DateParser.parseDate(string). The correct
         * format is: "DD/MM/YYYY"
         */
        if (!(date.matches("\\d{2}/\\d{2}/\\d{4}"))) {
            if (date.equals("")) {
                return false;
            } else {
                throw new MyExceptions(1);
            }
        } else {
            return true;
        }
    }

    public static void checkSalary(String salary, float maxSalary) throws MyExceptions {
        /**
         * Checks if the given float is a valid salary in the Employee class
         * context. A valid salary is a float that is above 0f and below the
         * maxSalary variable.
         */
        float sal;
        
        try {
            sal = Float.parseFloat(salary);

            if (sal > maxSalary || sal < 0) {
                throw new MyExceptions(2);
            }
        } catch (Exception ex) {
            throw new MyExceptions(2);
        }
        
    }

    public static void checkSalary(float salary, float maxSalary) throws MyExceptions {
        /**
         * Checks if the given float is a valid salary in the Employee class
         * context. A valid salary is a float that is above 0f and below the
         * maxSalary variable.
         */

        if (salary > maxSalary) {
            throw new MyExceptions(2);
        }

    }
    
    public static void checkSalary(String maxSalary) throws MyExceptions{
        float sal;
        try {
            
            sal = Float.parseFloat(maxSalary);
            
            if (sal < 0) {
                throw new MyExceptions(2);
            }
        } catch (Exception ex) {
            throw new MyExceptions(2);
        }
    }
    
    public static void checkEmpty(String field, String text) throws MyExceptions {
        if(field.equals("")){
            MyExceptions.text = text;
            throw new MyExceptions(5);
        }
    }
    
    

    /*------------------------------------------------------------------------*/
    public static final void invalidDateMessage() {
        /**
         * Shows an error message for when the format of the date string, or the
         * values of the fields in the date string are invalid.
         */
        message = "Error - Fecha no válida. \n Por favor, introduzca una fecha con formato \"DD/MM/YYYY\"";
        /*System.out.println("Error - Fecha no v\\u00e1lida. \n"
                + "Por favor, introduzca una fecha con formato \"DD/MM/YYYY\"");*/
    }

    public static final void invalidSalaryMessage() {
        /**
         * Shows an error message for when the salary is invalid.
         */
        message = "Error - Salario no válido. \nPor favor, introduzca un salario válido.";
        //System.out.println("Error - Salario no válido. \nPor favor, introduzca un salario válido.");
    }

    public static final void invalidIDMessage() {
        /**
         * Shows an error message for when the ID is invalid.
         */
        message = "Error - Ese ID ya está en uso o no es válido.";
        //System.out.println("Error - Ese ID ya está en uso o no es válido.");
    }
    
    public static final void invalidNameMessage(){
        message = "Error - Debe introducir un nombre.";
    }
    
    public static final void invalidFieldMessage(){
        message = "Error - Debe indicar un valor para " + text + ".";
    }

    /*------------------------------------------------------------------------*/
    public void showMessage() {
        /**
         * Show the full traceback of the exception.
         */
        System.out.println(this.getMessage());
    }

    @Override
    public String getMessage() {
        return message;
    }
}
