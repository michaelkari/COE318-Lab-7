package coe318.lab7;

/**
 *
 * @author Michael Karimizadeh 500831189
 */
public class Resistor {
    private static int resistorCounter=1;//static variable to assist constructor
    private int resistorId;//private variable to assign resistor IDs
    double resistance;
    Node[] node = new Node[2];
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance >= 0){
            this.resistance = resistance;
            if(node1 == null || node2 == null){
                throw new IllegalArgumentException("Can not have negative resistance");
            }
            else{
                node[0] = node1;
                node[1] = node2;
            }
            resistorId = resistorCounter;//1 since nodeCounter is initially set
            resistorCounter = resistorId+1;//increases resistor counter while keeping it in terms of resistors created
        }
        else{//Impossible resistance error
            throw new IllegalArgumentException("Invalid resistance ~ can not be negative");
        }
        Circuit.getInstance().add(this);//Adds to circuit after being created
    }
    public Node[] getNodes(){
        return node;
    }
    @Override
    public String toString(){
        String output;
        output  ="R"+Integer.toString(resistorId);
        output +=" "+getNodes()[0]+" "+getNodes()[1];
        output +=" "+Double.toString(resistance)+"\u2126";// resistance + ohm symbol
        return output;
    }
    //Main testing method from previous lab but no longer required
    /*
    public static void main (String[]args){//Example Main for testing
       Node node1, node2, node3, node4;
        node1 = new Node();
        node2 = new Node();
        node3 = new Node();
        node4 = new Node();
        
        Resistor resistor1,resistor2,resistor3;
        resistor1 = new Resistor(30, node1, node2);
        resistor2 = new Resistor(123.123, node2,node3);
        resistor3 = new Resistor(14.3, node4, node3);
        System.out.print(resistor1+"\n"+resistor2+"\n"+resistor3+"\n");
    }
    */
}
