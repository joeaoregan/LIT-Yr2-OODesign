
/**
 * Class TestPerson1.
 * 
 * Joe O'Regan  -  06-10-2015
 */
public class TestPerson1 
{
    public static void main(String[] args ) // Main Procedure that creates 3 instances of person
    {                                       // or 5 instances here ...just because
        Person P1 = new Person(); // using first constructor from Person that takes no args
        P1.walk(); // calling walk method from Person class
        
        Person P2 = new Person("Steve"); // using 2nd constructor that takes 1 arg
        P2.talk(); // call talk method for new person P1
        
        Person P3 = new Person("Tommaso", "idForP3", 54); // use constructor 3 - with 3 args
        P3.run();  // call run method
        
        Person P4 = new Person("Konstantinos", "blah2", 19);
            System.out.println(P4.getName() +" is walking."); // get name method
        
        Person P5 = new Person();
        P5.setName("Christina"); // sets name to Christina
            System.out.println(P5.getName() +" is studying.");
    }    
} // end of class TestPerson1
