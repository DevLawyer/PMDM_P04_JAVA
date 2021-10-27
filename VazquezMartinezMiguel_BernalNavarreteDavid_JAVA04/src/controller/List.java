package controller;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 */
public class List<T> {

    // CONSTRUCTOR /////////////////////////////////////////////////////////////
    public List() {
        headList = null;
        endList = null;
        current = null;
    }
<<<<<<< Updated upstream

    public void addNode(T item) {
        //This method adds a new node in the list and links both ends.

        Node nd = new Node(item);

        if (headList == null) {
=======
    
    public void addNode(T item, int index){
        //This method add a new node in the list and link both ends.
        
        Node nd = new Node(item, index);
        
        if(headList == null){
>>>>>>> Stashed changes
            headList = nd;
            endList = nd;
            current = nd;
        } else {
            nd.setFormerNode(endList);
            endList.setNextNode(nd);
            endList = nd;
        }
    }

    // LIST PROCESSING METHODS /////////////////////////////////////////////////
    public void moveForward() {
        //This method move de current pointer to the next node of the list.

        current = current.getNextNode();
        if (current == null) {
            current = endList;
        }
    }

    public void goBack() {
        //This method move de current pointer to the previous node of the list.

        current = current.getFormerNode();

        if (current == null) {
            current = headList;
        }
    }

    public void resetCurrent() {
        //When this method is called, it will move the current pointer to the head of the list.
        current = headList;
    }

    // GETTER METHODS //////////////////////////////////////////////////////////
    public Node getCurrent() {
        return current;
    }

    public Node getHeadList() {
        return headList;
    }

    public Node getEndList() {
        return endList;
    }

    // LIST ATTRIBUTES /////////////////////////////////////////////////////////
    private Node headList;
    private Node endList;
    private Node current;
}
