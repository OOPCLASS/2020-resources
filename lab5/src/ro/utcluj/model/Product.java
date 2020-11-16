package ro.utcluj.model;

public abstract class Product {

  private String name;

  public abstract String getDescription();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printDetails() {
    System.out.println(name);
    System.out.println(getDescription());
  }
}
