package coe318.lab7;
/**
 *
 * @author Michael Karimizadeh 500831189
 */
public class VoltageSource {
    private int voltageID;//Instance variable of Voltage number
    private static int following =1;//Static variable to access the next in line voltage number
    double v;//Voltage value
    Node []  node = new Node[2];
    public VoltageSource(double volt, Node n1, Node n2){
       //Assumes negative input voltage iff user previously inverted nodes
       this.v = volt;
       if(n1 == null||n2 == null){//Exception for empty nodes
            throw new IllegalArgumentException("Invalid, Nodes may not be null");
       }else{
            node[0] = n1;
            node[1] = n2;
       }
       voltageID = following;//Sets ID
       following = voltageID + 1;//Increases temp value storage
       //Next line adds voltage to circuit. Allowed do to this due to circuit being instance
       Circuit.getInstance().addV(this);
    }
    public Node [] getNodes(){
       return node;
    }
    @Override
    public String toString(){
       String output;
       output = "Voltage (" + Integer.toString(voltageID);
       output += ") " + getNodes()[0]+ " " + getNodes()[1];
       output += " DC = " + Double.toString(v);
       return output;
    }
}
