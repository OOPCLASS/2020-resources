package ro.utcluj;

import ro.utcluj.model.Bicycle;
import ro.utcluj.model.Headphones;
import ro.utcluj.model.Product;
import ro.utcluj.model.TechnicalSpecification;

public class Main {

  public static void main(String[] args) {
    for (Product product : getProducts()) {
      System.out.println(product.getDescription());
    }
  }

  public static Product[] getProducts() {
    Headphones headphones = new Headphones();
    headphones.setTitle("Sony headphones");
    TechnicalSpecification technicalSpecification = new TechnicalSpecification();
    technicalSpecification.setWeightInG(100);
    headphones.setTechnicalSpecification(technicalSpecification);

    Bicycle bicycle = new Bicycle();
    bicycle.setTitle("Pegas scump");
    bicycle.setElectric(true);

    Product[] products = new Product[2];
    products[0] = headphones;
    products[1] = bicycle;
    return products;
  }
}
