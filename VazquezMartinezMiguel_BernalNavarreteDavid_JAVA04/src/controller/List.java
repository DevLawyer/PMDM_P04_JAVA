package controller;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 * Class List: This class is for List objects, which will contain Nodes. Nodes
 * are added at the END of the List; which is denoted by endList.
 *
 * Since Nodes have previous and next nodes, this List can be easily iterated in
 * both ways.
 *
 * This class also allows to check whether or not a next/previous node exists.
 */

public class List<T> {

    /*------------------------------------------------------------------------*/
    // List Attributes
    private Node headList;
    private Node endList;
    private Node current;

    /*------------------------------------------------------------------------*/
    // Constructor
    public List() {
        headList = null;
        endList = null;
        current = null;
    }

    /*------------------------------------------------------------------------*/
    // Add node
    public void addNode(T item) {
        //This method adds a new node in the list and links both ends.

        Node nd = new Node(item);

        if (headList == null) {
            headList = nd;
            endList = nd;
            current = nd;
        } else {
            nd.setFormerNode(endList);
            endList.setNextNode(nd);
            endList = nd;
        }
    }

    public void addNode(T item, int index){
        //This method add a new node in the list and link both ends.
        
        Node nd = new Node(item, index);
        
        if(headList == null){
            headList = nd;
            endList = nd;
            current = nd;
        } else {
            nd.setFormerNode(endList);
            endList.setNextNode(nd);
            endList = nd;
        }
    }
    /*------------------------------------------------------------------------*/
    // List processing methods
    public void moveForward() {
        //This method moves the pointer to the following node.

        current = current.getNextNode();
        if (current == null) {
            current = endList;
        }
    }

    public void goBack() {
        // This method moves the pointer back to the previous node.

        current = current.getFormerNode();

        if (current == null) {
            current = headList;
        }
    }

    public void currentToHead() {
        // When this method is called, it will move the current pointer to the head of the list.
        current = headList;
    }
    
    public void currentToEnd(){
        current = endList;
    }

    public boolean hasNext() {
        return this.current.hasNext();
    }

    public boolean hasFormer() {
        return this.current.hasFormer();
    }

    public boolean isEmpty() {
        return this.headList == null;
    }

    /*------------------------------------------------------------------------*/
    // Getters
    public Node getCurrent() {
        return current;
    }

    public Node getHeadList() {
        return headList;
    }

    public Node getEndList() {
        return endList;
    }
}
