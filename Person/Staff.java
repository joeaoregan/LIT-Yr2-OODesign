
/**
 * Write a description of class Staff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Staff extends Employee
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Staff
     */
    public Staff()
    {
        // initialise instance variables
        super();
        setSalary(300.0);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
