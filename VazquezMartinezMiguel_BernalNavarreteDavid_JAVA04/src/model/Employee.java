package model;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 *
 * Class Employee:
 * This class is going to be uninstanciable, hence, it is going to be abstract.
 * It is also going to implement the interface Serializable.
 * Both classes Programmer and Analyst will extend this class, so they will both be serializable.
 * It will have 2 constructors: one with a parameter for every attribute this class has, and another one
 * with a parameter for each attribute except maxSalary.
 * This class will use MyExceptions for exception control.
 *
 * Employee will contain the following methods:
 *      -2 Constructors.
 *      -Getters and Setters for each attribute.
 *      -Abstract method toString().
 *      -Abstract method toBinary().
 *      -Abstract method parseEmployee(String).
 *      -Abstract method udpateSalary().
 *
 * This class is to be implemented without any expected use of the console.
 */

import java.io.Serializable;
import java.util.*;
import controller.*;

public abstract class Employee implements Serializable {
    // Attributes
    protected int id;
    protected transient String name;
    protected float salary;
    protected static float maxSalary = 0;
    protected GregorianCalendar entryDate;
    
    /*------------------------------------------------------------------------*/
    // Constructor
    public Employee(String id, String name, String salary, String maxSalary, 
            String entryDate) throws MyExceptions {
        setId(id);
        setName(name);
        setSalary(salary);
        setMaxSalary(maxSalary);
        setEntryDate(entryDate);
    }    

    /*------------------------------------------------------------------------*/
    // Setters
    public final void setId(String id) {
        this.id = Integer.parseInt(id);
    }
    
    public final void setName(String name) {
        this.name = name;
    }
    
    public final void setSalary(String salary) throws MyExceptions {
        if (!(maxSalary == 0))
            MyExceptions.checkSalary(salary);
        else 
            this.salary = Float.parseFloat(salary);
    }
    
    public final void setMaxSalary(String newMaxSalary) {
        Employee.maxSalary = Float.parseFloat(newMaxSalary);
    }
    
    public final void setEntryDate(String date) throws MyExceptions {
        // We check whether the date is alright, if it is an empty string ("")
        // we assign it the system date; else we just throw an exception.
        if (MyExceptions.checkDate(date))
            this.entryDate = DateParser.parseDate(date);
        else 
            this.entryDate = new GregorianCalendar();
    }
    
    /*------------------------------------------------------------------------*/
    // Getters
    public int getIdEmployee() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public float getSalary() {
        return salary;
    }
    
    public float getMaxSalary() {
        return maxSalary;
    }
    
    public String getEntryDate() {
        return DateParser.parseDate(this.entryDate);
    }
    
    /*------------------------------------------------------------------------*/
    // Additional methods.
    public String getEntryDay() {
        return DateParser.parseDate(entryDate).substring(0, 2);
    }
    
    public String getEntryMonth() {
        return DateParser.parseDate(entryDate).substring(3, 5);
    }
    
    public String getEntryYear() {
        return DateParser.parseDate(entryDate).substring(6);
    }
    
    public static Employee parseEmployee(String s) {
        String[] data = s.split(";");
        Employee res = null;
        try {
            switch (data[0]) {
                case "Analyst" -> res = new Analyst(data[1], data[2], data[3], data[4], data[5],
                            data[6], data[7]);
                case "Programmer" -> res = new Programmer(data[1], data[2], data[3], data[4], data[5],
                            data[6], data[7]);
                default -> { res = null;
                }
            }
        } catch (MyExceptions ex) {
            ex.showMessage();
        }
        return res;
    }
    
    // Abstract methods
    @Override
    public abstract String toString ();
    public abstract void updateSalary() throws MyExceptions ;
    
}
