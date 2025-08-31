class car{
  String model;
  int year;

  car(String model, int year){
    this.model = model;
    this.year = year;
  }
  void display(){
    System.out.println(model +" " + year );
  }
}


public class CarC {
  public static void main(String[] args) {
    car mycar = new car("Toyota", 2020);
    mycar.display();
  }
}
