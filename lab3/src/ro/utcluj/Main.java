package ro.utcluj;

import ro.utcluj.model.Laptop;
import ro.utcluj.model.Lego;
import ro.utcluj.model.Product;
import ro.utcluj.model.TechnicalSpecifications;

public class Main {

  public static void main(String[] args) {
    for (Product product : getProducts()) {
      System.out.println(product.getDescription());
    }
  }

  private static Product[] getProducts() {
    Laptop laptop = new Laptop();
    laptop.setTitle("Laptop super bun");
    laptop.setPrice(1599.00);

    TechnicalSpecifications technicalSpecifications = new TechnicalSpecifications();
    technicalSpecifications.setRamMemorySizeInMb(8000);

    Lego lego = new Lego();
    lego.setTitle("Lego Minecraft");
    lego.setPrice(124.99);

    Product[] products = new Product[2];
    products[0] = laptop;
    products[1] = lego;
    return products;
  }
}
