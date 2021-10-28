package controller;

import java.io.*;
import javax.swing.*;
import model.*;
import view.FrameMain;


/**
 * 
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 * 
 * This class is used to implement the methods which update data 
 * from a file or save data in a file.
 */
public class updateSaveData {
    /*------------------------------------------------------------------------*/
    // Attributes
    private static FrameMain auxFrame;
    private static List myList = FrameMain.getMainList();
    
    /*------------------------------------------------------------------------*/
    public static void updateFromFile(){
        //This method charge in updatedList the information contained in a data.dat file in case that this exist.
        
        try {
            FileInputStream fis = new FileInputStream("data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object auxO = ois.readObject();

            while(auxO != null){
                if(auxO instanceof Analyst auxA){
                    myList.addNode(auxA);
                } else if(auxO instanceof Programmer auxP){
                    myList.addNode(auxP);
                }
                
                auxO = ois.readObject();
            }
            
            JOptionPane.showMessageDialog(auxFrame, "Información cargada.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(auxFrame, "ERROR fichero no encontrado.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException | IOException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR clase no encontrada.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    /*------------------------------------------------------------------------*/
    public static void saveInFile(){
        //This method save in a data.dat file the information which is contained in saveList. The file will be overwride if the file already exist.
        
        if(myList.getHeadList() == null){
            JOptionPane.showMessageDialog(auxFrame, "ERROR no hay datos para guardar.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                FileOutputStream fos = new FileOutputStream("data.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
                myList.currentToHead();
                
                do{
                    oos.writeObject(myList.getCurrent().getData());
                    myList.moveForward();
                }while(myList.getCurrent().hasNext());

                oos.close();
                fos.close();
                
                JOptionPane.showMessageDialog(auxFrame, "Información guardada.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex){
                JOptionPane.showMessageDialog(auxFrame, "ERROR al guardar la información.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
