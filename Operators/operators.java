public class operators {
  public static void main(String[] args) {
    int a = 10, b= 3;

  // Arithmetic
  System.out.println("sum: " + (a + b));
  System.out.println("modulus: " + (a % b));
  a++;
  System.out.println("After increment, a: " + a);

  // Relational
  System.out.println("is a > b? " + (a > b));
  System.out.println("is a == b? " + (a == b));

  // Logical
  boolean x = true, y = false;
  System.out.println("x && y: " + (x && y));
  System.out.println("x || y: " + (x || y));
  System.out.println("!x : " + (!x));

  // Assignment
  a += 5;
  System.out.println("After a +=5, a: " + a);
  }
}
