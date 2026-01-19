class Array1{
  public static void main(String[] args) {
    int[] a = {13, 34, 45, 32, 13};
    int total = 0;
    for(int b : a){
      total = total + b; 
    }
    System.out.println(total);
  }
}