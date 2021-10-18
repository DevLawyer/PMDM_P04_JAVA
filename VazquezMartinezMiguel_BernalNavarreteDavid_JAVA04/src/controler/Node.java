package controler;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

public class Node <I>{
    
    // CONSTRUCTOR /////////////////////////////////////////////////////////////
    public Node(I item){this.data = item;}
    
    //SETTER METHODS ///////////////////////////////////////////////////////////
    public void setNextNode(Node<I> nextNode){this.nextNode = nextNode;}
    
    public void setFormerNode(Node<I> formerNode){this.formerNode = formerNode;}
    
    // GETTER METHODS //////////////////////////////////////////////////////////
    public I getData(){return data;}
    
    public Node<I> getNextNode(){return nextNode;}
    
    public Node<I> getFormerNode(){return formerNode;}
    
    // NODE ATTRIBUTES /////////////////////////////////////////////////////////
    private I data;
    private Node<I> nextNode;
    private Node<I> formerNode;
}
