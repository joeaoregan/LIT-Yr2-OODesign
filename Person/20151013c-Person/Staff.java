
/**
 * Write a description of class Staff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Staff extends Employee
{
    // instance variables - replace the example below with your own
    private double x;
    
    public Staff(String _name, String _id, int _age)
    {
        super(_name, _id, _age);
        //setSalary(10.20);
    }
    
    /**
     * Constructor for objects of class Staff
     */
    public Staff()
    {
       super();
       //setSalary(10.20);
    }
    public void isPaid()
    {
        
        System.out.println("Staff member: " + getName() + " is paid an hourly wage of " + getSalary());
    }
}