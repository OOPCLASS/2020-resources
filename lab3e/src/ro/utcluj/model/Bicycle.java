package ro.utcluj.model;

public class Bicycle extends Product {

  private boolean electric;

  public Bicycle() {
    System.out.println("Initializing Bicycle");
  }

  public Bicycle(boolean electric) {
    this.electric = electric;
  }

  public boolean isElectric() {
    return electric;
  }

  public void setElectric(boolean electric) {
    this.electric = electric;
  }

  @Override
  public String getDescription() {
    return String.format("Title: %s, is electric: %b", getTitle(), electric);
  }
}
