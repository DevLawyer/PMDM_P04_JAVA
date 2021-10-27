package model;

import controller.DateParser;

/**
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * Class Analyst: Inherits from Employee and implements DateInterface This class
 * adds 2 other attributes: -static float annualPlus: An annual salary plus for
 * every Analyst. It must be between 0 and 1, since it is a %. -String
 * projectName: The project that each Analyst is assigned to work on.
 *
 * This class must implement all abstract methods from both Employee and
 * DateInterface.
 */
public class Analyst extends Employee implements DateInterface {

    // Attributes
    private static float annualPlus;
    private String projectName;

    /*------------------------------------------------------------------------*/
    // Constructors
    public Analyst(String id, String name, String salary, String maxSalary, String entryDate) {
        super(id, name, salary, maxSalary, entryDate);
    }

    public Analyst(String id, String name, String salary, String maxSalary,
            String entryDate, String annualPlus, String projectName) {
        super(id, name, salary, maxSalary, entryDate);
        setAnnualPlus(annualPlus);
        setProjectName(projectName);
    }

    /*------------------------------------------------------------------------*/
    // Setters
    public final void setAnnualPlus(String annualPlus) {
        Analyst.annualPlus = Float.parseFloat(annualPlus);
    }

    public final void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /*------------------------------------------------------------------------*/
    // Getters
    public static float getAnnualPlus() {
        return Analyst.annualPlus;
    }

    public String getProjectName() {
        return this.projectName;
    }

    /*------------------------------------------------------------------------*/
    // Inherited abstract methods from Employee
    @Override
    public String toString() {
        return "Analyst;" + this.name + ";" + this.id + ";" + this.salary + ";"
                + Analyst.maxSalary + ";" + this.entryDate + ";"
                + Analyst.annualPlus + ";" + this.projectName;
    }

    @Override
    public void updateSalary() {
        if (passedOneYear()) {
            this.salary += (this.salary * Analyst.annualPlus);
        }
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
