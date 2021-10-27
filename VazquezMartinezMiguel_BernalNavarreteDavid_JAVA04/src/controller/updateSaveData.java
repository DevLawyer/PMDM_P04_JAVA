package controller;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import model.*;
import view.FrameMain;


/**
 * This class is used tu implements de methods which update data from a file or save data in a file.
 */
public class updateSaveData {
    
    public static void updateFromFile(){
        //This method charge in updatedList the information contained in a data.dat file in case that this exist.
        
        try {
            FileInputStream fis = new FileInputStream("data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object auxO = ois.readObject();

            while(auxO != null){
                if(auxO instanceof Analyst auxA){
                    myList.addNode(auxA, auxA.getIdEmployee());
                } else if(auxO instanceof Programmer auxP){
                    myList.addNode(auxP, auxP.getIdEmployee());
                }
                
                auxO = ois.readObject();
            }
            
            JOptionPane.showMessageDialog(auxFrame, "Información cargada.");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(auxFrame, "ERROR fichero no encontrado.");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR clase no encontrada.");
        } catch (EOFException ex){
            
        } catch (IOException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR clase no encontrada.");
        }
        
    }
    
    public static void saveInFile(){
        //This method save in a data.dat file the information which is contained in saveList. The file will be overwride if the file already exist.
        
        if(myList.getHeadList() == null){
            JOptionPane.showMessageDialog(auxFrame, "ERROR no hay datos para guardar.");
        }else{
            try {
                FileOutputStream fos = new FileOutputStream("data.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
                myList.resetCurrent();
                
                do{
                    oos.writeObject(myList.getCurrent().getData());
                    myList.moveForward();
                }while(myList.getCurrent() != myList.getEndList());

                oos.close();
                
                JOptionPane.showMessageDialog(auxFrame, "Información guardada.");
            } catch (IOException ex){
                JOptionPane.showMessageDialog(auxFrame, "ERROR al guardar la información.");
            }
        }
    }
    
    private static FrameMain auxFrame;
    private static List myList = FrameMain.getMainList();
}
