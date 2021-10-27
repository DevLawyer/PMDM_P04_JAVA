package controller;

import model.Employee;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * Class Node: 
 * This nodes are prepared to have a following and a previous node,
 * thus making it easier to navigate the List which will use these nodes. Nodes
 * contain the information of the object T given in the constructor, and also
 * have an index to make it easier to
 */
public class Node<T> {

    /*------------------------------------------------------------------------*/
    // Node attributes
    private T data;
    private Node nextNode;
    private Node formerNode;
    private int index;

    /*------------------------------------------------------------------------*/
    // Constructor
    public Node(T item) {
        setData(item);
    }

    /*------------------------------------------------------------------------*/
    // Setters
    public final void setData(T item) {
        this.data = item;

        if (item instanceof Employee employee) {
            this.index = employee.getIdEmployee();
        }
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setFormerNode(Node formerNode) {
        this.formerNode = formerNode;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /*------------------------------------------------------------------------*/
    // Getters
    public T getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getFormerNode() {
        return formerNode;
    }

    public int getIndex() {
        return index;
    }

    /*------------------------------------------------------------------------*/
    // Additional methods
    public boolean hasNext() {
        // Returns true if a following node exists.
        return this.nextNode != null;
    }

    public boolean hasFormer() {
        // Returns true is a posterior node exists.
        return this.formerNode != null;
    }
}
