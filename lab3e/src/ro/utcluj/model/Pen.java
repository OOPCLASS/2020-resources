package ro.utcluj.model;

public class Pen extends Product {

  private TechnicalSpecification technicalSpecification;

  public Pen() {
    System.out.println("Initializing Pen");
  }

  public TechnicalSpecification getTechnicalSpecification() {
    return technicalSpecification;
  }

  public void setTechnicalSpecification(TechnicalSpecification technicalSpecification) {
    this.technicalSpecification = technicalSpecification;
  }

  @Override
  public String getDescription() {
    if (technicalSpecification != null) {
      return String.format("Title: %s, length(cm): %.2f", getTitle(), technicalSpecification.getLengthInCm());
    }
    return super.getDescription();
  }
}
