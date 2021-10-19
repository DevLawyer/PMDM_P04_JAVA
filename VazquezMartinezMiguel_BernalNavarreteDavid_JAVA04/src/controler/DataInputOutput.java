package controler;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import model.*;
import view.*;

public class DataInputOutput{
    
    // READ NUMBERS METHODS ////////////////////////////////////////////////////
    public static int readInt(String input){
        //This method convert the string input to int output.
        
        int num = 0;
        
        try{
            num = Integer.parseInt(input);
        }catch(NullPointerException e){
        }catch(NumberFormatException e){        
        }        
        
        return num;
    }
    
    public static double readDouble(String input){
        //Method to parse string input to float type number.
        
        double num = 0;
        
        try{
            num = Double.parseDouble(input);
        }catch(NullPointerException e){           
        }catch(NumberFormatException e){
        }
        
        return num;
    }
    
    public static float readFloat(String input){
        //Method to parse string input to float type number.
        
        float num = 0;
        
        try{
            num = Float.parseFloat(input);
        }catch(NullPointerException e){
        }catch(NumberFormatException e){               
        }
        
        return num;
    }
    
    
    // READ DATE METHOD ////////////////////////////////////////////////////////
    public static GregorianCalendar readDate(String dateIn){
        //This method recaive a string date wich is convert to Gregorian Calendar object.
        
        GregorianCalendar entryDate;
        
        if(!dateIn.contains(" ")){
            entryDate = new GregorianCalendar(  Integer.parseInt(dateIn.substring(6)), 
                                                Integer.parseInt(dateIn.substring(3, 5))-1, 
                                                Integer.parseInt(dateIn.substring(0, 2)));  
        }else{
            entryDate = new GregorianCalendar();
        }
        
        return entryDate;
    }
    
    // WRITE DATE METHOD ///////////////////////////////////////////////////////
    public static String writeDate(GregorianCalendar entryDate){
        //This methods format the inpot object to string.
        
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        return formatDate.format(entryDate.getTime());
    }
    
    // CHECK SALARY AND MAX SALARY METHODS /////////////////////////////////////
    /*public boolean checkSalary(double salary){
        //This method check if the salary is less than maxSalary.
        
        boolean correct = true;
        maxSalaryAutoDefine();

        if(salary < 0 || salary == 0){
            //The salary is incorrect if is a negative number or equal zero.
            
            JFrameMain.warning.setMessage("No es un valor válido para SUELDO.");
            JFrameMain.warning.setVisible(true);      
            correct = false;
            
        }else if(salary > Employee.getMaxSalary()){
            //If max salary is define the salary can't be grater than max salary.
            
            JFrameMain.warning.setMessage("El SUELDO no puede ser mayor que "+Employee.getMaxSalary()+"€.");
            JFrameMain.warning.setVisible(true); 
            correct = false;         
        }
        
        return correct;
    }    */
    
    public boolean checkMaxSalary(float newMaxSalary, Object obj){
        //This method check if the new Max Salary is less than a previous max salary or the maximum salary of the list.
        
        boolean check = true;
        Employee auxEmp = (Employee) obj;

        if(newMaxSalary < auxEmp.getSalary()){ 
            /*In case that the new max salary will be less than the current max salary, 
            this option inform the user about that.*/
            JFrameMain.warning.setMessage("El MÁXIMO no puede ser inferior a " + auxEmp.getSalary() + "€.");
            JFrameMain.warning.setVisible(true); 
            check = false;
        }else{
            auxEmp.setMaxSalary(newMaxSalary);
        }
        
        return check;
    }
    
    public boolean checkId(int id){
        //This method check if the new id already exist.
        
        boolean check = true;
        boolean exit = true;
        miLista.resetCurrent();
        Employee auxEmp;

        do{
            if(miLista.getCurrent() != null){ //This option prevent the null pointer exception.
                if(miLista.getCurrent() == miLista.getEndList()){ //This option control the case when the current is equal end of list.
                    exit = false;
                }

                auxEmp = (Employee)miLista.getCurrent().getData();

                if(auxEmp.getIdEmployee() == id){
                    JFrameMain.warning.setMessage("Ya existe un registro con el ID: " + id + ".");
                    JFrameMain.warning.setVisible(true); 
                    check = false;
                    break;
                }

                miLista.moveForward();
            }
        }while(exit);  
        
        return check;
    }

    private List miLista = JFrameMain.getLista(); // Recieve the list content in the JFrameMain.
}
