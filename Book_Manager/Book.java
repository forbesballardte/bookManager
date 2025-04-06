
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String author;
    private int quantity;
    // private String image;

    /**
     * Constructor for objects of class Book
     */
    public Book(int key, String nm, String auth, int qty)
    {
        // initialise instance variables
        int id = key;
        String name = nm;
        String author = auth;
        int quantity = qty;
    }
    
    public int getId() 
    {
        return this.id;
    }
    
    public String getName() 
    {
        return this.name;
    }
    
    public String getAuthor() 
    {
        return this.author;
    }
    
    public int getQuantity() 
    {
        return this.quantity;
    }
}
