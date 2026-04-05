
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
       public Employee(String _name, String _id, int _age)
     {
         super(_name, _id, _age); // call the super constructor & pass in the appropriate values
    }
    public void work() // a new method, only in Employee
    {
        System.out.print(getName() + " is working.\n"); // a new print statement
    }
}
