
/**
 * Class TestPerson here.
 * 
 * Joe O'Regan 
 * 06-10-2015
 */
public class TestPerson 
{
    public static void main(String[] args )
    {
        
        
        /*Person P1 = new Person("Tom", "blah2", 31);
        System.out.print(P1.getName() +" is walking.\n");
        P1.walk(); // calling walk method from Person class
        P1.talk();
        P1.run();     
        */
        Employee E1 = new Employee("Peter", "blahs324", 56);
        E1.walk(); // calling walk method from Person class, extended by Employee class
        E1.work(); // calling work method from Employee class
        
        //P1.name="blah"; //if name was public
                
        /*Person P2 = new Person();
        P2.walk();
        P2.talk();
        P2.run();*/
        
        /*Person P3 = new Person();
        P3.walk();
        P3.talk();
        P3.run();   */
        
    }    
}
