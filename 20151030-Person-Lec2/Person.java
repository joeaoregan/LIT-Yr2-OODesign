/**
 * Person class, with id, name and age details.
 * 
 * @Joe O'Regan 
 * @28-09-2015
 */
import java.io.*;
public class Person 
{
                                //definition of state variables
  String name;        
  int age;
 Person ()
  {                             //Constructor method - no args
       name = "";
       age = 0;
  }                             //End of the constructor
  void setName (String name) 
  {                             // example of modifier 
       this.name = name;
  }    
  String getName   ( ) 
  {                             // example of selector
       return this.name;
  }    
}
