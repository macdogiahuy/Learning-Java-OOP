public class Main {
  public static void main(String[] args) {
    Person person = new Person("Nguyen Van A", 20);

    // access the private variable using getter and setter

    // getter used to get the value of the private variable
    System.out.println(person.getName());
    System.out.println(person.getAge());

    // setter used to change the value of the private variable
    person.setName("Nguyen Van B");
    person.setAge(25);
    System.out.println(person.getName());
    System.out.println(person.getAge());

    // set age with invalid value
    person.setAge(-5);
    System.out.println(person.getAge());
  }
}