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
 *      -Abstract method toBytes().
 *      -Abstract method parseEmployee(String).
 *      -Abstract method calculateSalary().
 *
 * This class is to be implemented without any expected use of the console.
 *
 * TO-DO: Correct methods and remove unnecessary code.
 * TO-DO: Implement all methods.
 */

import java.io.Serializable;
import java.util.*;
import controller.*;

public class Employee implements Serializable {
    // Attributes
    protected int id;
    protected transient String name;
    protected float salary;
    protected static float maxSalary;
    protected GregorianCalendar entryDate;

    public Employee(int id, String name, float salary, float maxSalary, String entryDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        Employee.maxSalary = maxSalary;
        this.entryDate = DateParser.parseDate(entryDate);
    }    

        // SETTERS METHODS /////////////////////////////////////////////////////////
    public void setName(String name){this.name = name;}
    
    public void setSalary(float salary){this.salary = salary;}
    
    public void setMaxSalary(float newMaxSalary){maxSalary = newMaxSalary;}
    
    //public void setEntryDate(String dateIn){this.entryDate = DataInputOutput.readDate(dateIn);}
    

    // GETTERS METHODS /////////////////////////////////////////////////////////
    public String getName(){return name;}
    
    public float getSalary(){return salary;}
    
    public float getMaxSalary(){return maxSalary;}
    
    public int getIdEmployee(){return id;}
    
    //public String getEntryDate(){return DataInputOutput.writeDate(entryDate);}

    //public String getEntryDay(){return DataInputOutput.writeDate(entryDate).substring(0, 2);}
    
    //public String getEntryMonth(){return DataInputOutput.writeDate(entryDate).substring(3, 5);}
    
    //public String getEntryYear(){return DataInputOutput.writeDate(entryDate).substring(6);}
}
