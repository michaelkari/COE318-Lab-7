package coe318.lab7;
/**
 *
 * @author Michael Karimizadeh 500831189
 */
import java.util.Scanner;
import java.util.ArrayList;
public class UI implements UserInterface {
    Circuit cir = Circuit.getInstance();//Circuit Instance
    private Scanner sc = new Scanner(System.in);//Input scanner
    private String element;//User input tracker
    private double value;//User input value tracker
    private int n1,n2;
    ArrayList<Node> nodeList = new ArrayList();//Array of nodes to append as program runs
    @Override
    public void promptUser(){
        System.out.println("Add a voltage [v] or resistor [r] to the circuit by following with a magnitude and two nodes");
        System.out.println("ie. v 1 2 20.1\nie. r 1 2 20.1");
        System.out.println("To Display Circuit -> Type [spice]");
        System.out.println("To End Program -> Type [end]");
        do{
            element = sc.next().toLowerCase();//Takes letter input from user, makes lowercase for user accesibility
            if((element.equals("r"))||(element.equals("v"))){//Check for resistor or voltage
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                value = sc.nextDouble();
                if(n1<0 ||n2<0){//Null nodes execption.
                    throw new IllegalArgumentException("Invalid, Nodes may not be negative");
                }
                //Sets new node as highest node entered, to allow for user to enter in any order they want
                //ie. v 21 1 0
                //This input creates 2 nodes , 0 to 1 since n1 recieves 1 as a value
                while(nodeList.size()<=n1||nodeList.size()<=n2){
                    nodeList.add(new Node());
                }
                //First component comparison as directed by user input
                //Adds voltage to circuit if 'v'
                //Adds resistor to circuit if 'r'
                if(element.equals("r")){
                    new Resistor(value,nodeList.get(n1),nodeList.get(n2));//Adds resistor to circuit according to magnitude, node 1 and node 2
                }
                else if(element.equals("v")){
                    new VoltageSource(value,nodeList.get(n1),nodeList.get(n2));//Adds Voltage Source to circuit according to magnitude, node 1 and node 2
                }
            }
            else if(element.equals("spice")){//Run spice method if spice command is entered
                spice();
            }
            else if(element.equals("end")){
                //If end command is entered, nothing displays and goes to end method
            }
            else{
                System.out.println("Enter a valid command");//Occurs when none of v,r,end,or spice is entered; loops again
            }
        }while(!(element.equals("end")));//Program keeps looping until end is entered
    }
    @Override
    public void spice(){//Displays Current made by User
        System.out.print(cir);
    }
    @Override
    public void end(){//Displays Goodbye when ending program
        System.out.println("Goodbye!");
    }
}
