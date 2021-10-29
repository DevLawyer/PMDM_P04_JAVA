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
    private static JFileChooser fileChooser = new JFileChooser();
    
    /*------------------------------------------------------------------------*/
    public static void updateFromFile(){
        //This method charge in updatedList the information contained in a data.dat file in case that this exist.
        
        try {
            
            int select = fileChooser.showOpenDialog(auxFrame);
            
            if(select == JFileChooser.APPROVE_OPTION){
                FileInputStream fis = new FileInputStream(fileChooser.getSelectedFile());
                ObjectInputStream ois = new ObjectInputStream(fis);
                System.out.println("1");
                Object auxO = ois.readObject();
                int i= 0;
                while(auxO != null){
                    myList.addNode(auxO);

                    auxO = ois.readObject();
                    System.out.println(i++);
                }
                ois.close();
                JOptionPane.showMessageDialog(auxFrame, "Información cargada.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }else if (select == JFileChooser.ERROR_OPTION){
                JOptionPane.showMessageDialog(auxFrame, "ERROR al cargar la información.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(auxFrame, "ERROR fichero no encontrado.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR clase no encontrada.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(auxFrame, "ERROR Fallo en la ejecución.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    /*------------------------------------------------------------------------*/
    public static void saveInFile(){
        //This method save in a data.dat file the information which is contained in saveList. The file will be overwride if the file already exist.
        
        if(myList.getHeadList() == null){
            JOptionPane.showMessageDialog(auxFrame, "ERROR no hay datos para guardar.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                int select = fileChooser.showSaveDialog(auxFrame);
                
                if(select == JFileChooser.APPROVE_OPTION){
                    FileOutputStream fos = new FileOutputStream(fileChooser.getSelectedFile());
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    myList.currentToHead();
                    int i = 0;
                    do{
                        oos.writeObject(myList.getCurrent().getData());
                        myList.moveForward();
                        System.out.println(i);
                        i++;
                    }while(myList.getCurrent().hasNext());

                    oos.close();
                    fos.close();

                    JOptionPane.showMessageDialog(auxFrame, "Información guardada.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }else if (select == JFileChooser.ERROR_OPTION){
                    JOptionPane.showMessageDialog(auxFrame, "ERROR al guardar la información.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex){
                JOptionPane.showMessageDialog(auxFrame, "ERROR al guardar la información.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
