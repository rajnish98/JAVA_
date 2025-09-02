// Java Program to show the use of
// Static variables
import java.io.*;

public class staticvar{
    
    // Declared static variable
    public static String geek = "Rajnish Pandey";
  
    public static void main(String[] args)
    {

        // geek variable can be accessed without object
        // creation Displaying O/P Geeks.geek --> using the
        // static variable
        System.out.println("Geek Name is: " + staticvar.geek);

        // static int c = 0;
        // above line, when uncommented,
        // will throw an error as static variables cannot be
        // declared locally.
    }
}