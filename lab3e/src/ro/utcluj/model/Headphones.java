package ro.utcluj.model;

public class Headphones extends Product {

  private TechnicalSpecification technicalSpecification;

  public TechnicalSpecification getTechnicalSpecification() {
    return technicalSpecification;
  }

  public void setTechnicalSpecification(TechnicalSpecification technicalSpecification) {
    this.technicalSpecification = technicalSpecification;
  }

//  @Override
//  public String getDescription() {
//    if (technicalSpecification != null) {
//      return String.format("Title: %s, weight: %d", getTitle(), technicalSpecification.getWeightInG());
//    }
//    return "";
//  }
}
