
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Button
     */
    public Button()
    {
        // initialise instance variables
        name="Button";
    }
    public void lightOn()
    {
        System.out.print(name + " light is on\n");
    }
    public void lightOff()
    {
        System.out.print("Button light is off\n");
    }
}
