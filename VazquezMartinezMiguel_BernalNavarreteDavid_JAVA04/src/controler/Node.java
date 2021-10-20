package controler;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

public class Node<T>{
    
    // CONSTRUCTOR /////////////////////////////////////////////////////////////
    public Node(T item){this.data = item;}
    
    //SETTER METHODS ///////////////////////////////////////////////////////////
    public void setNextNode(Node nextNode){this.nextNode = nextNode;}
    
    public void setFormerNode(Node formerNode){this.formerNode = formerNode;}

    public void setIndex(int index){this.index = index;}
    
    // GETTER METHODS //////////////////////////////////////////////////////////
    public T getData(){return data;}
    
    public Node getNextNode(){return nextNode;}
    
    public Node getFormerNode(){return formerNode;}
    
    // NODE ATTRIBUTES /////////////////////////////////////////////////////////
    private T data;
    private Node nextNode;
    private Node formerNode;
    private int index;
}
