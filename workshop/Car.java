public class Car {
  private String colour;
  private int enginePower;
  private Boolean convertible;
  private Boolean parkingBrake;

  // Default constructor
  public Car() {
    this.colour = "";
    this.enginePower = 0;
    this.convertible = false;
    this.parkingBrake = false;
  }

  // Constructor with parameters
  public Car(String colour, int enginePower, Boolean convertible, Boolean parkingBrake) {
    this.colour = colour;
    this.enginePower = enginePower;
    this.convertible = convertible;
    this.parkingBrake = parkingBrake;
  }

  // Getters and setters

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public int getEnginePower() {
    return enginePower;
  }

  public void setEnginePower(int enginePower) {
    this.enginePower = enginePower;
  }

  public Boolean getConvertible() {
    return convertible;
  }

  public void setConvertible(Boolean convertible) {
    this.convertible = convertible;
  }

  public Boolean getParkingBrake() {
    return parkingBrake;
  }

  public void setParkingBrake(Boolean parkingBrake) {
    this.parkingBrake = parkingBrake;
  }

  // Method to press the start button
  public void pressStartButton() {
    System.out.println("You have pressed the start button");
  }

  // Method to press the accelerator button
  public void pressAcceleratorButton() {
    System.out.println("You have pressed the Accelerator button");
  }

  // Method to output values of all fields
  public void output() {
    System.out.println("Colour: " + colour);
    System.out.println("Engine Power: " + enginePower);
    System.out.println("Convertible: " + convertible);
    System.out.println("Parking Brake: " + parkingBrake);
  }
}