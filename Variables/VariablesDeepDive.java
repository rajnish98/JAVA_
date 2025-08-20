public class VariablesDeepDive {
public static void main(String[] args){
  // primitive types
  int age = 25;
  double salary = 45000.75;
  char initial = 'A';
  boolean isStudent = false;
// non-primitive type
String name = "Rajnish Pandey";

// printing value
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Salary: " + salary);
System.out.println("Initial: " + initial);
System.out.println("Is Student: " + isStudent);

// type casting
int intSalary = (int) salary; // Explicit casting (double to int)
System.out.println("Salary as int:  " + intSalary); // Loses decimal part

}
}