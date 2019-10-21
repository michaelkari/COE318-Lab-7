package coe318.lab7;

/**
 *
 * @author Michael Karimizadeh 500831189
 */
public class Node{
    private static int nodeCounter;//static variable to assist constructor
    private int nodeId;//private variable to assign node IDs
    public Node(){
        nodeId=nodeCounter;//0 since nodeCounter is not initially set
        nodeCounter=nodeId+1;//increases node counter while keeping it in terms of nodes created
    }
    @Override
    public String toString(){
        return  Integer.toString(nodeId);// returns string form of node number
    }
    //Main testing method from previous lab but no longer required
    /*
    public static void main(String[] args){//Test main to examine increasing node ids
        Node node1,node2,node3,node4;
        node1 = new Node();
        node2 = new Node();
        node3 = new Node();
        node4 = new Node();
        System.out.print(node1+"\n"+node2+"\n"+node3+"\n"+node4+"\n");
    }
    */
}
