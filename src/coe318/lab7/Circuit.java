package coe318.lab7;

/**
 *
 * @author Michael Karimizadeh 500831189
 */
import java.util.*;
public class Circuit {
    ArrayList<Resistor> resistorList;
    ArrayList<VoltageSource> voltageList;
    private static Circuit instance = null;
    public static Circuit getInstance(){
        if(instance == null){
            instance = new Circuit();
        }
        return instance;
    }
    private Circuit(){
        resistorList = new ArrayList();//Create arraylist of resistors
    }
    public void add(Resistor r){
        resistorList.add(r);//add given resistor
    }
    public void addV(VoltageSource v){
        voltageList.add(v);//add given voltage
    }
    @Override
    public String toString(){//Output all resistors/properties
        String output = "";
        for(Resistor i : resistorList){
            output += i +"\n";
        }
        return output+"\n";//Outputs all properties of all resistors
    }
    //Main testing method from previous lab but no longer required
    /*
    public static void main(String[]args){//Example Main for testing circuit
        Node node1, node2, node3, node4;
        node1 = new Node();
        node2 = new Node();
        node3 = new Node();
        node4 = new Node();
        
        Resistor resistor1,resistor2,resistor3,resistor4;
        resistor1 = new Resistor(30, node1, node2);
        resistor2 = new Resistor(123.123, node2,node3);
        
        Circuit circuit1 = Circuit.getInstance();
        System.out.println(circuit1);//resistor 1 and 2 circuit
        System.out.println("Circuit 1 before including resistor 3 with Circuit 2:\n"+circuit1);
      
        Circuit circuit2 =  Circuit.getInstance();//New circuit made with getInstance method
        resistor3 = new Resistor(14.3, node4, node2);
        System.out.println("Circuit 2 including resistor 3:\n"+circuit2);//Outputs both circuits and their resistors
        System.out.println("Circuit 1 after including resistor 3 with Circuit 2:\n"+circuit1);
        
        Circuit circuit3 = new Circuit();//New circuit without getInstance method
        resistor4 = new Resistor(99.99,node2,node3);
        System.out.println("Circuit 3 created without getInstance method\n"+circuit3);//New resistor separated from circuit 1 and 2
        System.out.println("Circuit 1 with getInstance method\n"+circuit1);
    }
    */
}
