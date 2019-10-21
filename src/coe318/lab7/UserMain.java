package coe318.lab7;
/**
 *
 * @author Michael Karimizadeh 500831189
 */
public class UserMain {
    private UserInterface interact;//Required UserInterface Variable
    public UserMain(UserInterface intct){
        this.interact = intct;
    }
    public static void main(String[]args){//Main method for program
        UserMain createCir = new UserMain(new UI());//New object created from User Interface parameter
        createCir.interact.promptUser();
        createCir.interact.end();
    }
}
/*
 * Since UI class has non-static methods, Interface must be used to accomodate. This is due to 
 * limitations of not being able to use non-static methods within static methods. Initializing
 * Circuit into UserMain would result in this error if Circuit was run. If the main was allowed
 * to be run in the Circuit Class or initialize a Circuit object during the main, the result
 * would be different. In that specific scenario, it would be inefficient and hard to follow
 * since the operations are done in main without methods. Interface is used to access non-static
 * methods within the static main.
 */
