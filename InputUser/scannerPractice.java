import java.util.Scanner;
public class scannerPractice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int Num1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    int Num2 = sc.nextInt();

    //cler buffer
    sc.nextLine();

    int add = Num1 + Num2;
    int sub = Num1 - Num2;
    int multi = Num1 * Num2;
    int modulus = Num1 / Num2;

    System.out.println("After Addition: " + add);
    System.out.println("After substraction: " + sub);
    System.out.println("After multipication: " + multi);
    System.out.println("After Modulus: " + modulus);

    sc.close();
    
  }
}
