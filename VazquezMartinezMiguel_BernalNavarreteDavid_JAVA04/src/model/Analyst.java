package model;

/**
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 * 
 * Class Analyst:
 * Inherits from Employee and implements DateInterface
 * This class adds 2 other attributes:
 *      -static float annualPlus: An annual salary plus for every Analyst.
 *          It must be between 0 and 1, since it is a %.
 *      -String projectName: The project that each Analyst is assigned to work 
 *          on.
 * 
 * This class must implement all abstract methods from both Employee and 
 * DateInterface.
 */

import controller.DateParser;

public class Analyst extends Employee implements DateInterface{

    // Attributes
    
    private float annualPlus;
    private String projectName;
    
    /*------------------------------------------------------------------------*/
    // Constructors
    
    public Analyst(String id, String name, String salary, String maxSalary,
            String entryDate) throws MyExceptions {
        super(id, name, salary, maxSalary, entryDate);
    }
    
    public Analyst(String id, String name, String salary, String maxSalary,
            String entryDate, String annualPlus, String projectName) throws MyExceptions {
        super(id, name, salary, maxSalary, entryDate);
        setAnnualPlus(annualPlus);
        setProjectName(projectName);
    }
    
    /*------------------------------------------------------------------------*/
    // Setters
    
    public final void setAnnualPlus(String annualPlus) {
        if(!annualPlus.equals("")){
            this.annualPlus = Float.parseFloat(annualPlus);
        }else{
            this.annualPlus = 0;
        }
    }
    
    public final void setProjectName(String projectName) {
        if(!projectName.equals("")){
            this.projectName = projectName;
        }else{
            projectName = "-";
        }
    }
    
    /*------------------------------------------------------------------------*/
    // Getters
    
    public float getAnnualPlus() {
        return this.annualPlus;
    }
    
    public String getProjectName() {
        return this.projectName;
    }
    
    /*------------------------------------------------------------------------*/
    // Inherited abstract methods from Employee
    
    @Override
    public String toString() {
        return "Analyst;" + this.name + ";" + this.id + ";" + this.salary + ";" 
                + this.maxSalary + ";"  + DateParser.parseDate(this.entryDate) + ";"  
                + this.annualPlus + ";" + this.projectName;
    }
    
    @Override
    public void updateSalary() throws MyExceptions {
        MyExceptions.checkSalary(this.salary + this.annualPlus, this.maxSalary);
        this.salary += (this.salary * this.annualPlus);
    }
    
    /*------------------------------------------------------------------------*/
    // Inherited abstract methods from DateInterface
    
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
