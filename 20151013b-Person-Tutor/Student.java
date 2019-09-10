
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private int studentNumber;
    private String name;
   
    // instance variables
    //private int x;

    /**Constructor for objects of class Student*/
    public Student()
    {
        // initialise instance variables
        name=null;
        studentNumber=-1;
    }
    public Student(String n, int sn)
    {
        name=n;
        studentNumber=sn;
    }
    public void printDetails()
    {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Name: " + name);
    }

    /**
     * An example of a method
     
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }*/
}
