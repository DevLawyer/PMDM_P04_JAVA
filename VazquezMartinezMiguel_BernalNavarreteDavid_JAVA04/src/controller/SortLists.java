package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;
import model.*;
import view.FrameMain;

/**
 *
 * @author migva
 */
public class SortLists {
    
    public SortLists(){
        insertInsaneNumberOfRecords();
        copyToCollection();
        sortOwnList();
        sortCollection();
        JOptionPane.showMessageDialog(auxFrame, "Se ha ordenado el listado.");
    }
    
    private void insertInsaneNumberOfRecords(){
        Random r = new Random();
        String rand;
        
        for(int i = 0; i < 12500; i++){
            //Adding a new Analyst.
            try{
                rand = Integer.toString(r.nextInt(60000-1000)+1000);
                Analyst auxA = new Analyst(rand, "Analyst"+i+1, "0", "1", "10/10/2010");
                myList.addNode(auxA, auxA.getIdEmployee());
            } catch (MyExceptions ex) {
                JOptionPane.showMessageDialog(auxFrame, ex.getMessage());
                ex.showMessage();
            }
            
            //Adding a new Programmer.
            try{
                rand = Integer.toString(r.nextInt(60000-1000)+1000);
                Programmer auxP = new Programmer(rand, "Programmer"+i+1, "0", "1", "10/10/2010");
                myList.addNode(auxP, auxP.getIdEmployee());
            } catch (MyExceptions ex) {
                JOptionPane.showMessageDialog(auxFrame, ex.getMessage());
                ex.showMessage();
            }
        }
        
    }
    
    private void copyToCollection(){
        myList.currentToHead();
        cpyList.add(myList.getCurrent().getData());

        do{
            myList.moveForward();
            cpyList.add(myList.getCurrent().getData());
        }while(myList.getCurrent().hasNext());
    }
    
    private void sortOwnList(){
   
        Employee auxObj = null;
        Node auxNode = null;
        myList.currentToHead();
        
        ownListTime = System.currentTimeMillis();
        while(myList.getCurrent() != myList.getEndList()){
            
            auxNode = myList.getCurrent().getNextNode();
            
            while(auxNode != null){
                
                if(myList.getCurrent().getIndex() > auxNode.getIndex()){
                    
                    auxObj = (Employee)myList.getCurrent().getData();
                    myList.getCurrent().setData(auxNode.getData());
                    myList.getCurrent().setIndex(auxNode.getIndex());
                    auxNode.setData(auxObj);
                    auxNode.setIndex(auxObj.getIdEmployee());
                    
                }
                
                auxNode = auxNode.getNextNode();
            }

            myList.moveForward();
        }
        ownListTime = System.currentTimeMillis() - ownListTime;
    }
    
    private void sortCollection(){
        collectionTime = System.currentTimeMillis();
        
        cpyList.sort(new Comparator<Employee>(){

                @Override
                public int compare(Employee p1, Employee p2) {
                    return p1.getIdEmployee() < p2.getIdEmployee()? -1
                            : p1.getIdEmployee() > p2.getIdEmployee()? 1
                            :0;
                }
        });
        
        collectionTime = System.currentTimeMillis() - collectionTime;
    }

    public static long getOwnListTime(){
        return ownListTime;
    }
    
    public static long getCollectionTime(){
        return collectionTime;
    }
    
    private static long ownListTime;
    private static long collectionTime;
    private List myList = FrameMain.getMainList();
    private ArrayList cpyList = new ArrayList();
    private static FrameMain auxFrame;
    private FrameMain frameMain;
}
