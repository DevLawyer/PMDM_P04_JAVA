package model;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

public class Programmer extends Employee implements DateInterface{

    public Programmer (int id, String name, float salary, float maxSalary, String entryDate){
        super(id, name, salary, maxSalary, entryDate);
    }
    
    public float getExtraSalary(){
        //This method must be complete.
        
        return 0.0f;
    }
    
    
    @Override
    public void updateSalary(){
        //This method must be complete.
    }
    
    
    @Override
    public boolean passedOneMonth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean passedOneQuarter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean passedOneYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
