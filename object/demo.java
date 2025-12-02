class demo {
  int x = 10; // instance variable
  // static int y = 20; // class variable
  
  public static void main(String args[]) {
    System.out.println(new demo().x); // anonymous object or unrefrence object
    demo d = new demo();
    System.out.println(d.x);
    // int z = 30; // local variable
    // demo d1 = new demo();
    // demo d2 = new demo();
    
  }
}
