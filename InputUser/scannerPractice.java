import java.util.Scanner;
public class scannerPractice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double Num1 = sc.nextDouble();
    System.out.println("Enter the second number: ");
    Double Num2 = sc.nextDouble();

    //cler buffer
    sc.nextLine();

    double add = Num1 + Num2;
    double sub = Num1 - Num2;
    double multi = Num1 * Num2;
    double modulus = Num1 / Num2;

    System.out.println("After Addition: " + add);
    System.out.println("After substraction: " + sub);
    System.out.println("After multipication: " + multi);
    System.out.println("After Modulus: " + modulus);

    sc.close();
    
  }
}
