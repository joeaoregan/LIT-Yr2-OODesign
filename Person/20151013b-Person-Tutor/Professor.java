
/**
 * Write a description of class Professor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Professor extends Employee
{
    // instance variables - replace the example below with your own
    
    /** Constructor for objects of class Professor */
    public Professor()
    {
        // initialise instance variables
       // x = 0;
       super();
       setSalary(5000.0);
    }

    public void isPaid(){
        System.out.println("Professor " 
        +getName() + " is payed on a monthly salary of : " + getSalary());
    }
}
