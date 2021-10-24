package controller;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import view.FrameMain;


/**
 * This class is used tu implements de methods which update data from a file or save data in a file.
 */
public class updateSaveData {
    
    public static void updateFromFile(List updateList){
        //This method charge in updateList the information contained in a data.dat file in case that this exist.
        
        File inputFile = new File("data.dat");
        try {
            if(inputFile.exists()){
                FileInputStream fis = new FileInputStream(inputFile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                
                updateList = (List)ois.readObject();
                ois.close();
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(auxFrame, "ERROR al cargar la información.");
        } catch (IOException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR al cargar la información.");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR al cargar la información.");
        }
    }
    
    public static void saveInFile(List saveList){
        //This method save in a data.dat file the information which is contained in saveList. The file will be overwride if the file already exist.
        try {
            FileOutputStream fos = new FileOutputStream("data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(saveList);
            oos.close();
            
        } catch (IOException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR al guardar la información.");
        }
    }
    
    private static FrameMain auxFrame;
}
