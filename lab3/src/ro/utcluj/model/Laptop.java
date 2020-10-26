package ro.utcluj.model;

public class Laptop extends Product {

  private TechnicalSpecifications technicalSpecifications;

  public TechnicalSpecifications getTechnicalSpecifications() {
    return technicalSpecifications;
  }

  public void setTechnicalSpecifications(TechnicalSpecifications technicalSpecifications) {
    this.technicalSpecifications = technicalSpecifications;
  }

  @Override
  public String getDescription() {
    if (technicalSpecifications != null) {
      return String.format("Title: %s, price: %.2f, RAM: %d", getTitle(), getPrice(), technicalSpecifications.getRamMemorySizeInMb());
    }
    return super.getDescription();
  }
}
