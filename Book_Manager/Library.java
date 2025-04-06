import java.util.HashMap;
import ecs100.*;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables
    private HashMap<Integer, Book> library;
    private int currBookId;
    private Book currBook;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        library = new HashMap<Integer, Book>(); // initialise HashMap
        
        // create books
        Book b1 = new Book(1, "The Wicked King", "Holly Black", 2);
        Book b2 = new Book(2, "Harry Potter", "J.K Rowling", 4);
        Book b3 = new Book(3, "1984", "George Orwell", 6);
        
        // add books to collection
        library.put(1, b1);
        library.put(2, b2);
        library.put(3, b3);
        
        this.currBookId = 3;
    }
    
    public void menu()
    {
        String choice;
        do {
            UI.println("(A)dd a Book");
            UI.println("(F)ind a Book");
            UI.println("(P)rint all Books");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a Choise: ");
            
            if (choice.equalsIgnoreCase("A")) {
                // add books
            } else if (choice.equalsIgnoreCase("F")) {
                // find a book
            } else if (choice.equalsIgnoreCase("P")) {
                // Print all books
            } else if (choice.equalsIgnoreCase("Q")) {
                UI.println("Goodbye");
                UI.quit();
            } else {
                UI.println("Not an Option");
            }
        } while (!choice.equalsIgnoreCase("Q"));
    }
}
