public class Guitar {
  private String serialNumber;
  private int price;
  private String builder;
  private String model;
  private String backWood;
  private String topWood;

  // constructor

  public Guitar() {
    this.serialNumber = "";
    this.price = 0;
    this.builder = "";
    this.model = "";
    this.backWood = "";
    this.topWood = "";
  }

  public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  // getters and setters
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    if (serialNumber == null || serialNumber.trim().equals("")) {
      throw new IllegalArgumentException("Serial number cannot be null or empty");
    } else {
      this.serialNumber = serialNumber;
    }
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getBuilder() {
    return builder;
  }

  public void setBuilder(String builder) {
    this.builder = builder;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBackWood() {
    return backWood;
  }

  public void setBackWood(String backWood) {
    this.backWood = backWood;
  }

  public String getTopWood() {
    return topWood;
  }

  public void setTopWood(String topWood) {
    this.topWood = topWood;
  }

  public void createSound() {
    System.out.println("Serial Number: " + getSerialNumber());
    System.out.println("Price: " + getPrice());
    System.out.println("Builder: " + getBuilder());
    System.out.println("Model: " + getModel());
    System.out.println("Back Wood: " + getBackWood());
    System.out.println("Top Wood: " + getTopWood());
  }
}