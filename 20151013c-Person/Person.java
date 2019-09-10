/**
 * Person class, with id, name and age details.
 * 
 * Joe O'Regan 
 * 06-10-2015
 */
public class Person
{
    // instance variables
    private String name, id;
    private int age;
    
    /** Constructor for objects of class Person */
    /** Constructor with no args, and default values */
    public Person()  // Default Constructor (has no arguments & defaulst values are set for variables)
    {
       name="Joe";
       age=34;
       id="blah1";
    }
    public Person(String newName)  // Constructor with 1 argument
    {
        name = newName;
    }
    public Person(String _name, String _id, int _age)  // Constructor with 3 arguments
    {
       name = _name;
       age = _age;
       id = _id;
    }
    
    /** get methods */
    public String getName() 
    {  /* give access to name variable //return value for name variable, so it is accessible to external classes */
        return name;
    }
    public int getAge()
    {  //  age variable is now accessible to external class using getAge()
    	return age;
    }
    public String getId()
    { // The Private id variable of Person Class is now usable in class TestPerson
    	return id;
    }
    
    /** set methods */
    public void setName (String newName) 
    {  // setName overwrites the content of name with the String new Name ...for external access (testPerson class etc)
    	name = newName;
    }
    public void setAge (int newAge) 
    {  /*setAge sets the value of name externally in TestPerson etc */
    	age = newAge;
    }
    public void setID (String newId)
    {
    	id = newId;
    }
    
    /** Exercise 2 */
    /** Methods for class Person - behaviour*/
    public void walk()
    {
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
} // end of class Person
