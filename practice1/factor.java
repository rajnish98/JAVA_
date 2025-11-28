public class factor {
  public static void main(String args[]){
    int n = 15;
    System.out.println("factor of " + n + " number ");
    for(int i = 1; i <= n; i++)
    {
      if (n % i == 0) {
        System.out.println(i);
        // avoid duplication
        // if (i * i != n) {
        //   System.out.println(n / i);
        // }
      }
    }

  }
  
}
