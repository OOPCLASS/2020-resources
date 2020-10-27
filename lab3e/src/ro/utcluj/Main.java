package ro.utcluj;

import ro.utcluj.model.MakeupPallete;
import ro.utcluj.model.Pen;
import ro.utcluj.model.Product;
import ro.utcluj.model.TechnicalSpecification;

public class Main {

  public static void main(String[] args) {
    for (Product product : getProducts()) {
      System.out.println(product.getDescription());
//      if (product instanceof Pen) {
//        TechnicalSpecification technicalSpecification = ((Pen) product).getTechnicalSpecification();
//        if (technicalSpecification != null) {
//          System.out.println(technicalSpecification.getLengthInCm());
//        }
//      }
//      if (product instanceof MakeupPallete) {
//        System.out.println(((MakeupPallete) product).getWeightInG());
//      }
    }
  }

  public static Product[] getProducts() {
    Pen pen = new Pen();
    pen.setTitle("Stilou Pelikan");
    TechnicalSpecification technicalSpecification = new TechnicalSpecification();
    technicalSpecification.setLengthInCm(12.5);
    //pen.setTechnicalSpecification(technicalSpecification);

    MakeupPallete makeupPallete = new MakeupPallete();
    makeupPallete.setTitle("Maybelline");
    makeupPallete.setWeightInG(12);

    Product[] products = new Product[2];
    products[0] = pen;
    products[1] = makeupPallete;
    return products;
  }
}
