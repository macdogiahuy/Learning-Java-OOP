class Car {
  String brand;
  int year;

  // Constructor
  Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  // Method t print car's info

  void printInfo() {
    System.out.println("Car brand: " + brand + " Year: " + year);
  }
}

public class Main {
  public static void main(String[] args) {
    Car mycar = new Car("Ford", 2020);
    mycar.printInfo();
  }
}
