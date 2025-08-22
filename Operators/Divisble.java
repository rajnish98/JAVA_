public class Divisble {
  public static void main(String[] args) {
    // 2. Check divisibility by both 3 and 5 using logical operators
    int num = 30;
    if (num % 3 == 0 && num % 5 == 0) {
      System.out.println("is divisible by both 3 and 5." + num);
    } else {
      System.out.println(" is not divisible by both 3 and 5." + num);
    }
    // Use += to update a bank balance by adding interest (e.g., 5% of current
    // balance).

    double Balance = 1000000000;
    double Intrest = 0.05 * Balance;
    double TotalBalance = Intrest;
    System.out.println("Aftre adding intrest total balance is: " + TotalBalance);
    int TotalBal = (int) TotalBalance;
    System.out.println("Total Balance is: " + TotalBal);
  }
}