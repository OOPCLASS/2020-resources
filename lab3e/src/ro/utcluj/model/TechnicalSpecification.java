package ro.utcluj.model;

public class TechnicalSpecification {

  private boolean wireless;
  private Integer weightInG;
  private Double lengthInCm;
  private String tipMaterial;

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

  public Double getLengthInCm() {
    return lengthInCm;
  }

  public void setLengthInCm(Double lengthInCm) {
    this.lengthInCm = lengthInCm;
  }

  public String getTipMaterial() {
    return tipMaterial;
  }

  public void setTipMaterial(String tipMaterial) {
    this.tipMaterial = tipMaterial;
  }
}
