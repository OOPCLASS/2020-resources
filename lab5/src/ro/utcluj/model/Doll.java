package ro.utcluj.model;

public class Doll implements Comparable<Doll>, Discountable, Identifiable {

  private String color;

  public Doll(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public Double getDiscount() {
    return 10.0;
  }

  @Override
  public Long getId() {
    return 10L;
  }

  @Override
  public int compareTo(Doll doll) {
    return this.color.compareTo(doll.getColor());
  }
}
