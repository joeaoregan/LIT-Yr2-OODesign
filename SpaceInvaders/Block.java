
/**
 * Block class, with name, and number of parts details.
 * 
 * Joe O'Regan
 * 21-11-2015
 */
public class Block
{
    private String name;
    private int noBlockParts;

    public Block()
    {
    }
    public Block(String bloName, int bloParts)
    {
        name=bloName;
        noBlockParts=bloParts;
    }

    public void destroyBlock()
    {
    }
}
