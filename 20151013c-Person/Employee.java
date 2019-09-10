
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// extends -- employee is a subclass of person
public class Employee extends Person
{
    // set the default value for salary
    private double salary = 300;
    
    public Employee(String _name, String _id, int _age)
    {
         super(_name, _id, _age); // call the super constructor & pass in the appropriate values
    }
    public Employee()
    {
        super();
        salary = 350;
    }
    public void work() // a new method, only in Employee
    // getName is inherited from the superclass person
    {
        System.out.print(getName() + " is working.\n"); // a new print statement
    }
    
    // get salary method
    public double getSalary()
    {
        return salary;
    }
    // set salary method
    public void setSalary(double newSalary)
    {
        salary=newSalary;
    }
    public void isPaid()
    {
        System.out.println(getName() + "'s Salary is " + getSalary());
    }

}
