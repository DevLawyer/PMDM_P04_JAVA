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
 *      -Methods to update the salary.
 *      -Abstract method toString().
 *      -Abstract method toBytes().
 *      -Abstract method parseEmployee(String).
 *      -Abstract method calculateSalary().
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
    protected static float maxSalary;
    protected GregorianCalendar entryDate;
    
    /*------------------------------------------------------------------------*/
    // Constructor
    public Employee(String id, String name, String salary, String maxSalary, String entryDate) {
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
    
    public final void setName(String name){
        this.name = name;
    }
    
    public final void setSalary(String salary){
        this.salary = Float.parseFloat(salary);
    }
    
    public final void setMaxSalary(String newMaxSalary){
        Employee.maxSalary = Float.parseFloat(newMaxSalary);
    }
    
    public final void setEntryDate(String date) {
        this.entryDate = DateParser.parseDate(date);
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
    
    /*---------------------------*/
    public void updateSalary(String newSalary) {
        // Replaces the salary with the parsed float of the given string.
        this.salary = Float.parseFloat(newSalary);
    }
    
    public void updateSalary() {
        // Increments salary in 50.
        this.salary += 50f;
    }
    
    /*---------------------------*/
    public String getEntryDay() {
        return DateParser.parseDate(entryDate).substring(0, 2);
    }
    
    public String getEntryMonth() {
        return DateParser.parseDate(entryDate).substring(3, 5);
    }
    
    public String getEntryYear() {
        return DateParser.parseDate(entryDate).substring(6);
    }
    
    // Abstract methods
    @Override
    public abstract String toString ();
    public abstract void toBytes();
    public abstract void parseEmployee(String s);
    public abstract void calculateSalary();
    
}
