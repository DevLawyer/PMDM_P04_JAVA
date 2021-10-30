package model;

import controller.DateParser;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 * 
 * Class Analyst:
 * Inherits from Employee and implements DateInterface
 * This class adds 2 other attributes:
 *      -static float monthlyPlus: A monthly salary plus for every Programmer.
 *          This variable represents the monthly extra salary for a programmer.
 *      -float extraHours: Extra hours that a programmer has worked.
 * 
 * This class must implement all abstract methods from both Employee and 
 * DateInterface.
 */

public class Programmer extends Employee implements DateInterface{
    
    // Attributes
    
    private float monthlyPlus;
    private float extraHours;

    /*------------------------------------------------------------------------*/
    // Constructors
    
    public Programmer (String id, String name, String salary, String maxSalary, 
            String entryDate) throws MyExceptions {
        super(id, name, salary, maxSalary, entryDate);
    }
    
    public Programmer (String id, String name, String salary, String maxSalary, 
            String entryDate, String monthlyPlus, String extraHours) throws MyExceptions {
        super(id, name, salary, maxSalary, entryDate);
        setMonthlyPlus(monthlyPlus);
        setExtraHours(extraHours);
    }
    
    /*------------------------------------------------------------------------*/
    // Setters
    
    public final void setMonthlyPlus(String monthlyPlus) {
        if(!monthlyPlus.equals("")){
            this.monthlyPlus = Float.parseFloat(monthlyPlus);
        }else{
            this.monthlyPlus = 0;
        }
    }
    
    public final void setExtraHours(String extraHours) {
        if(!extraHours.equals("")){
            this.extraHours = Float.parseFloat(extraHours);
        }else{
            this.extraHours = 0;
        }
    }
    
    /*------------------------------------------------------------------------*/
    // Getters
    
    public float getMonthlyPlus(){
        return this.monthlyPlus;
    }
    
    public float getExtraHours() {
        return this.extraHours;
    }
    
    /*------------------------------------------------------------------------*/
    // Inherited abstract methods from Employee
    
    @Override
    public void updateSalary() throws MyExceptions {
        MyExceptions.checkSalary(this.salary + this.monthlyPlus, this.maxSalary);
        this.salary += this.monthlyPlus;
    }
    
    @Override
    public String toString() {
        return "Programmer;" + this.name + ";" + this.id + ";" + this.salary + ";" 
                + this.maxSalary + ";"  + DateParser.parseDate(this.entryDate) + ";"  
                + this.monthlyPlus + ";" + this.extraHours;
    }
    
    /*------------------------------------------------------------------------*/
    // Inhertied abstract methods from DateInterface
    
    @Override
    public boolean passedOneMonth() {
        return DateParser.passedMonth(this.entryDate);
    }

    @Override
    public boolean passedOneQuarter() {
        return DateParser.passedQuarter(this.entryDate);
    }

    @Override
    public boolean passedOneYear() {
        return DateParser.passedYear(this.entryDate);
    }
}
