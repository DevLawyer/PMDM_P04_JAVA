package controller;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;
import model.*;
import view.FrameMain;

public class SortLists {

    /*------------------------------------------------------------------------*/
    // Attributes
    // Time elapsed on List's sorting.
    private static long ownListTime;
    // Time elapsed on ArrayList's sorting.
    private static long collectionTime;

    private List myList = FrameMain.getMainList();
    private ArrayList cpyList = new ArrayList();

    private static FrameMain auxFrame;

    /*------------------------------------------------------------------------*/
    // Constructor
    public SortLists() {
        insertInsaneNumberOfRecords();
        copyToCollection();
        System.out.println("Ordenando ...");
        sortOwnList();
        sortCollection();
        JOptionPane.showMessageDialog(auxFrame, "Se ha ordenado el listado.");
    }

    /*------------------------------------------------------------------------*/
    // To insert 25000 items: 12500 Programmers and 12500 Analysts.
    // Their positions will be displaced by 1000.
    private void insertInsaneNumberOfRecords() {
        Random r = new Random();
        String rand;

        for (int i = 0; i < 12500; i++) {
            try {
                //Adding a new Analyst.
                rand = Integer.toString(r.nextInt(60000 - 1000) + 1000);
                Analyst auxA = new Analyst(rand, "Analyst"+i+1, "1500", "2000", "10/10/2010");
                myList.addNode(auxA, auxA.getIdEmployee());
                
                //Adding a new Programmer.
                rand = Integer.toString(r.nextInt(60000 - 1000) + 1000);
                Programmer auxP = new Programmer(rand, "Programmer"+i+1, "1500", "2000", "10/10/2010");
                myList.addNode(auxP, auxP.getIdEmployee());
                
            } catch (MyExceptions ex) {
                JOptionPane.showMessageDialog(auxFrame, ex.getMessage());
                ex.showMessage();
            }
        }
    }

    /*------------------------------------------------------------------------*/
    // To copy from the List to the ArrayList.
    private void copyToCollection() {
        myList.currentToHead();
        cpyList.add(myList.getCurrent().getData());

        do {
            myList.moveForward();
            cpyList.add(myList.getCurrent().getData());
        } while (myList.getCurrent().hasNext());
    }

    /*------------------------------------------------------------------------*/
    // Sorts the List item and calculates the time awaiting in the sorting.
    private void sortOwnList() {

        Employee auxObj = null;
        Node auxNode = null;
        myList.currentToHead();

        ownListTime = System.currentTimeMillis();
        while (myList.getCurrent() != myList.getEndList()) {

            auxNode = myList.getCurrent().getNextNode();

            while (auxNode != null) {

                if (myList.getCurrent().getIndex() > auxNode.getIndex()) {

                    auxObj = (Employee) myList.getCurrent().getData();
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

    /*------------------------------------------------------------------------*/
    // Sorts the ArrayList item and calculates the time awaiting in the sorting.
    private void sortCollection() {
        collectionTime = System.currentTimeMillis();

        cpyList.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee p1, Employee p2) {
                return p1.getIdEmployee() < p2.getIdEmployee() ? -1
                        : p1.getIdEmployee() > p2.getIdEmployee() ? 1
                        : 0;
            }
        });

        collectionTime = System.currentTimeMillis() - collectionTime;
    }

    /*------------------------------------------------------------------------*/
    // Getters
    public static long getOwnListTime() {
        return ownListTime;
    }

    public static long getCollectionTime() {
        return collectionTime;
    }

}
