
/**
 * Write a description of class TestPerson here.
 * 
 * @Joe O'Regan 
 * @29-09-2015
 */
public class TestPerson extends Person
{
    public static void main(String[] args )
    {
        Person P1 = new Person("Tom", "blah2", 31);
        P1.walk();
        P1.talk();
        P1.run();      
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
