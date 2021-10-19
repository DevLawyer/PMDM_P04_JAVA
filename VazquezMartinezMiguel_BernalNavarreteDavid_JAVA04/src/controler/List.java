package controler;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

public class List<T> {
    
    // CONSTRUCTOR /////////////////////////////////////////////////////////////
    public List(){
        headList = null;
        endList = null;
        current = null;
    }
    
    public void addNode(T item){
        //This method add a new node in the list and link both ends.
        
        Node nd = new Node(item);
        
        if(headList == null){
            headList = nd;
            endList = nd;
            current = nd;
        }else{
            nd.setFormerNode(endList);
            endList.setNextNode(nd); 
            endList = nd;
        }
    }
    
    // LIST PROCESSING METHODS /////////////////////////////////////////////////
    public void moveForward(){
        //This method move de current pointer to the next node of the list.
        
        current = current.getNextNode();
        if(current == null)
            current = endList;
    }
    
    public void goBack(){
        //This method move de current pointer to the previous node of the list.
        
        current = current.getFormerNode();
        
        if(current == null)
            current = headList;
    }
    
    public void resetCurrent(){
        //When is required this method move the current pointer to the head list from beginning.
        current = headList;
    }
    
    // GETTER METHODS //////////////////////////////////////////////////////////
    public Node getCurrent(){return current;}
    
    public Node getHeadList(){return headList;}
    
    public Node getEndList(){return endList;}
    
    // LIST ATTRIBUTES /////////////////////////////////////////////////////////
    private Node headList;         
    private Node endList;
    private Node current;
}
