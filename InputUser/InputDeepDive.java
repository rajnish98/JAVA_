import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class InputDeepDive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // String input
    System.out.println("Enter your full name: ");
    String name = sc.nextLine();

    // Integer input
    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    //Double input 
    System.out.println("Enter your height (in meters): ");
    double height = sc.nextDouble();

    //Clear buffer (important after nextInt/nextDouble)
    sc.nextLine();

    //characters input
    System.out.println("Enter your gender (M/F): ");
    char gender = sc.nextLine().charAt(0);

    System.out.println("Profile: ");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Gender: " + gender);

    sc.close();
  }
}
