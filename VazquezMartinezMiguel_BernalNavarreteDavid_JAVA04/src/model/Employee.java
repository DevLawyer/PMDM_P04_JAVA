package model;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

import java.util.*;
import controler.*;

public class Employee {
    
    public Employee(String name, float salary, String dateIn){
        this.name = name;
        this.salary = salary;
        this.entryDate = DataInputOutput.readDate(dateIn);
    }    

        // SETTERS METHODS /////////////////////////////////////////////////////////
    public void setName(String name){this.name = name;}
    
    public void setSalary(float salary){this.salary = salary;}
    
    public void setMaxSalary(float newMaxSalary){maxSalary = newMaxSalary;}
    
    public void setEntryDate(String dateIn){this.entryDate = DataInputOutput.readDate(dateIn);}
    

    // GETTERS METHODS /////////////////////////////////////////////////////////
    public String getName(){return name;}
    
    public float getSalary(){return salary;}
    
    public float getMaxSalary(){return maxSalary;}
    
    public int getIdEmployee(){return id;}
    
    public String getEntryDate(){return DataInputOutput.writeDate(entryDate);}

    public String getEntryDay(){return DataInputOutput.writeDate(entryDate).substring(0, 2);}
    
    public String getEntryMonth(){return DataInputOutput.writeDate(entryDate).substring(3, 5);}
    
    public String getEntryYear(){return DataInputOutput.writeDate(entryDate).substring(6);}
    
    
    
    // EMPLOYEE ATTRIBUTES /////////////////////////////////////////////////////    
    protected int id;
    protected transient String name;
    protected float salary;
    protected float maxSalary;
    protected GregorianCalendar entryDate;
}
