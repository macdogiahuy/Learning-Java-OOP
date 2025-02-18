// // superclass
// class Animal {
//   String name;

//   // constructor
//   Animal(String name) {
//     this.name = name;
//   }

//   void makeSound() {
//     System.out.println(name + " makes a sound");
//   }
// }

// class Dog extends Animal {
//   String breed;

//   // constructor
//   Dog(String name, String breed) {
//     super(name);
//     this.breed = breed;
//   }

//   @Override
//   void makeSound() {
//     System.out.println(name + " (loài " + breed + ") sủa: Gâu gâu!");
//   }
// }

class Employee {
  String name;
  int salary;

  // constructor
  Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public void work() {
    System.out.println(name + " " + salary + " I'm working");
  }
}

class IT_employee extends Employee {
  String programmingLanguage;

  // constructor

  IT_employee(String name, int salary, String programmingLanguage) {
    super(name, salary);
    this.programmingLanguage = programmingLanguage;
  }

  @Override
  public void work() {
    System.out.println("I'm writing code");
  }
}

class business_employee extends Employee {
  String position;

  // constructor

  business_employee(String name, int salary, String position) {
    super(name, salary);
    this.position = position;
  }

  @Override
  public void work() {
    System.out.println("I'm doing business");
  }
}

public class Main {
  public static void main(String[] args) {
    // Animal a = new Animal("con meo");
    // a.makeSound();

    // Dog d = new Dog("husky", "Golden");
    // d.makeSound();

    Employee e = new Employee("Nguyen Van A", 1000);
    e.work();
    IT_employee it = new IT_employee("Nguyen Van B", 2000, "Java");
    it.work();
    business_employee be = new business_employee("Nguyen Van C", 3000, "CEO");
    be.work();
  }
}
