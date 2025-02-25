import java.util.Scanner;

class Animal { // Super class
  private String color;

  void makeSound() {
    System.out.println("make sound ");
  }

  // getter setter
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Bark");
  }
}

class Cat extends Animal {
  public Cat() {
    super.setColor("null");
  }

  @Override
  void makeSound() {
    super.makeSound();
    System.out.println("Meow");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the color of cat: ");
    String catColor = sc.nextLine();
    Cat cat = new Cat();
    cat.setColor(catColor);
    System.out.println(cat.getColor());
  }
}
