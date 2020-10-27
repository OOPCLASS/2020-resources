package ro.utcluj.model;

public class MakeupPallete extends Product {

  private Integer weightInG;

  public Integer getWeightInG() {
    return weightInG;
  }

  public void setWeightInG(Integer weightInG) {
    this.weightInG = weightInG;
  }

  @Override
  public String getDescription() {
    return String.format("Title: %s, weight(g): %d", getTitle(), weightInG);
  }
}
