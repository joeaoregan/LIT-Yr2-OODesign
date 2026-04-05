
/**
 * Write a description of class Professor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Professor extends Employee
{
    public Professor()
    {
        super();
        setSalary(5000.0);
    }
    public Professor(String _name, String _id, int _age)
    {
        super(_name, _id, _age);
    }
    
    public void isPaid()
    {
        System.out.println("Professor: " + getName() + " is paid a monthly salary of " + getSalary());
    }
}
