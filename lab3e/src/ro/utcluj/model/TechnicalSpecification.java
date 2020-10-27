package ro.utcluj.model;

public class TechnicalSpecification {

  private boolean wireless;
  private Integer weightInG;

  public boolean isWireless() {
    return wireless;
  }

  public void setWireless(boolean wireless) {
    this.wireless = wireless;
  }

  public Integer getWeightInG() {
    return weightInG;
  }

  public void setWeightInG(Integer weightInG) {
    this.weightInG = weightInG;
  }
}
