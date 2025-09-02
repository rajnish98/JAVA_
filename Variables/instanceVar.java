import java.io.*;
public class instanceVar {

      // Declared Instance Variable
      public String Raj;
      public int i;
      public Integer I;
      public instanceVar()
      {
        // Default Constructor
        // initializing Instance Variable
        this.Raj = "Rajnish Pandey";
      }
      // Main method
      public static void main(String[] args) {
        // object creation
        instanceVar name = new instanceVar();
          // Displaying O/P
        System.out.println("Geek name is: " + name.Raj);
        System.out.println("Default value for int is "+ name.i);
      
        // toString() called internally
        System.out.println("Default value for Integer is: "+ name.I);
      }
}
