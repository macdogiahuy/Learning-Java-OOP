class Car {
  private String brand; // thuộc tính bị đóng gói attribute
  private String name;

  // constructor
  public Car(String brand, String name) {
    this.brand = brand;
    this.name = name;
  }

  // getter
  public String getBrand() {
    return brand;
  }

  public String getName() {
    return name;
  }

  // setter
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Toyota", "Camry");
    System.out.println(car.getBrand());
    System.out.println(car.getName());
    car.setBrand("Honda");
    car.setName("Civic");
    System.out.println("ten xe la " + car.getBrand() + " hang xe la " + car.getName());
  }
}