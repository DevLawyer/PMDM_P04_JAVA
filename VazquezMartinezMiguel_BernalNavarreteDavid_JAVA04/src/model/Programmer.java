package model;

import controller.DateParser;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * Class Programmer: 
 * Inherits from Employee and implements DateInterface This class
 * adds 2 other attributes: -static float monthlyPlus: A monthly salary plus for
 * every Programmer. This variable represents the monthly extra salary for a
 * programmer. -float extraHours: Extra hours that a programmer has worked.
 *
 * This class must implement all abstract methods from both Employee and
 * DateInterface.
 */
public class Programmer extends Employee implements DateInterface {

    // Attributes
    private static float monthlyPlus;
    private float extraHours;

    /*------------------------------------------------------------------------*/
    // Constructors
    public Programmer(String id, String name, String salary, String maxSalary, String entryDate) {
        super(id, name, salary, maxSalary, entryDate);
    }

    public Programmer(String id, String name, String salary, String maxSalary,
            String entryDate, String monthlyPlus, String extraHours) {
        super(id, name, salary, maxSalary, entryDate);
        setMonthlyPlus(monthlyPlus);
        setExtraHours(extraHours);
    }

    /*------------------------------------------------------------------------*/
    // Setters
    public final void setMonthlyPlus(String monthlyPlus) {
        Programmer.monthlyPlus = Float.parseFloat(monthlyPlus);
    }

    public final void setExtraHours(String extraHours) {
        this.extraHours = Float.parseFloat(extraHours);
    }

    /*------------------------------------------------------------------------*/
    // Getters
    public float getMonthlyPlus() {
        return Programmer.monthlyPlus;
    }

    public float getExtraHours() {
        return this.extraHours;
    }

    /*------------------------------------------------------------------------*/
    // Inherited abstract methods from Employee
    @Override
    public void updateSalary() {
        if (passedOneMonth()) {
            this.salary += Programmer.monthlyPlus;
        }
    }

    @Override
    public String toString() {
        return "Programmer;" + this.name + ";" + this.id + ";" + this.salary + ";"
                + Programmer.maxSalary + ";" + this.entryDate + ";"
                + Programmer.monthlyPlus + ";" + this.extraHours;
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
