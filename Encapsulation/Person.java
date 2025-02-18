class Person {
  private String name;
  private int age;

  // constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // getter: get the value of the private variable
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // setter change the value of the private variable
  public void setName(String name) { // person.setName("Nguyen Van B");
    this.name = name; // this.name = "Nguyen Van B";
  }

  // setter change the value of age (with condition)
  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Invalid age!");
    }
  }
}