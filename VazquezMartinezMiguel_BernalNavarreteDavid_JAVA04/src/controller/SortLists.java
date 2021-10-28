package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;
import model.*;
import view.FrameMain;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * Class SortLists: This class is used to fill our List with data, copy it to an
 * ArrayList, and calculate the difference in time elapsed while sorting each
 * one of them.
 */
public class SortLists {

    /*------------------------------------------------------------------------*/
    // Attributes
    // Time elapsed for our own list's sorting.
    private static long ownListTime;
    // Time elapsed for the Collection ArayList's sorting.
    private static long collectionTime;
    // Our list
    private List myList = FrameMain.getMainList();
    // The Collection ArrayList
    private ArrayList cpyList = new ArrayList();

    private static FrameMain auxFrame;
    private FrameMain frameMain;

    /*------------------------------------------------------------------------*/
    // Constructor
    public SortLists() {
        //insertInsaneNumberOfRecords();
        //copyToCollection();
        sortOwnList();
        //sortCollection();
        JOptionPane.showMessageDialog(auxFrame, "Se ha ordenado el listado.");
    }

    /*------------------------------------------------------------------------*/
    // To insert 25000 items, 12500 Analysts and 12500 Programmers, from
    // position 1000-26000
    private void insertInsaneNumberOfRecords() {
        Random r = new Random();
        String rand;

        for (int i = 0; i < 12500; i++) {
            //Adding a new Analyst.
            rand = Integer.toString(r.nextInt(60000 - 1000) + 1000);
            Analyst auxA;
            try {
                auxA = new Analyst(rand, "Analyst" + i + 1, "0", "1", "10/10/2010");
                myList.addNode(auxA, auxA.getIdEmployee());
            } catch (MyExceptions ex) {
                // This code is never gonna get into this catch
                System.out.println("Error introduciendo un Analista aleatorio.");
                ex.showMessage();
            }

            //Adding a new Programmer.
            rand = Integer.toString(r.nextInt(60000 - 1000) + 1000);
            Programmer auxP;
            try {
                auxP = new Programmer(rand, "Programmer" + i + 1, "0", "1", "10/10/2010");
                myList.addNode(auxP, auxP.getIdEmployee());
            } catch (MyExceptions ex) {
                // This code is never gonna get into this catch
                System.out.println("Error introduciendo un Programador aleatorio.");
                ex.showMessage();
            }
        }

    }

    /*------------------------------------------------------------------------*/
    // To copy the List into an ArrayList.
    private void copyToCollection() {
        myList.currentToHead();
        cpyList.add(myList.getCurrent().getData());

        do {
            myList.moveForward();
            cpyList.add(myList.getCurrent().getClass());
        } while (myList.getCurrent().hasNext());
    }

    /*------------------------------------------------------------------------*/
    // To sort the List, and calculate the time elapsed.
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
    // To sort the ArrayList, and calculate the time elapsed.
    private void sortCollection() {
        collectionTime = System.currentTimeMillis();

        cpyList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee p1, Employee p2) {
                return p1.getIdEmployee() - (p2.getIdEmployee());
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
