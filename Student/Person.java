
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name, id;
    private int age;
    //private String name="John";
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        name="Joe";
        age=34;
        id="blah1";
    }
    
    public void Person(String _name, String _id, int _age)
    //public void Person()
    {
       String personName;
       personName = name;
       // initialise instance variables
       name = _name;
       age = _age;
       id = _id;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void walk()
    {
        // put your code here
        System.out.print(name +" is walking.\n");
    }
    public void talk()
    {
        System.out.print(name +" is talking.\n");
    }
    public void run()
    {
        System.out.print(name +" is running.\n");
    }
}
