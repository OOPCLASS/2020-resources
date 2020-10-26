package ro.utcluj.model.product.electronics;

public class Dryer extends ElectronicProduct {

  private String color;

  public Dryer() {
    super(120);
    System.out.println("Initializing Dryer");
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
