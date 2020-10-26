package ro.utcluj.model.product.electronics;

import ro.utcluj.model.TechnicalSpecifications;

public class Laptop extends ElectronicProduct {

  private TechnicalSpecifications technicalSpecifications;

  public Laptop() {
    super(220);
    System.out.println("Initializing Laptop");
  }

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
