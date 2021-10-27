package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
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
    }
    
    private void insertInsaneNumberOfRecords(){
        Random r = new Random();
        String rand;
        
        for(int i = 0; i < 12500; i++){
            //Adding a new Analyst.
            rand = Integer.toString(r.nextInt(60000-1000)+1000);
            Analyst auxA = new Analyst(rand, "Analyst"+i+1, "0", "1", "10/10/2010");
            myList.addNode(auxA, auxA.getIdEmployee());
            
            //Adding a new Programmer.
            rand = Integer.toString(r.nextInt(60000-1000)+1000);
            Programmer auxP = new Programmer(rand, "Programmer"+i+1, "0", "1", "10/10/2010");
            myList.addNode(auxP, auxP.getIdEmployee());
        }
        
    }
    
    private void copyToCollection(){
        myList.resetCurrent();
        cpyList.add(myList.getCurrent());

        do{
            myList.moveForward();
            cpyList.add(myList.getCurrent());
        }while(myList.getCurrent() != myList.getEndList());
    }
    
    private void sortOwnList(){
        
    }
    
    private void sortCollection(){
        cpyList.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee p1, Employee p2) {
               return p1.getIdEmployee().compareTo(p2.getIdEmployee());
            }});
    }
    
    public static int getOwnListTime(){
        return ownListTime;
    }
    
    public static int getCollectionTime(){
        return collectionTime;
    }
    
    private static int ownListTime;
    private static int collectionTime;
    private List myList = FrameMain.getMainList();
    private ArrayList cpyList = new ArrayList();
}
