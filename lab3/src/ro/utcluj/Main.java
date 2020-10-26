package ro.utcluj;

import ro.utcluj.model.product.electronics.ElectronicProduct;
import ro.utcluj.model.product.electronics.Laptop;
import ro.utcluj.model.product.toys.Lego;
import ro.utcluj.model.product.Product;
import ro.utcluj.model.TechnicalSpecifications;

public class Main {

  public static void main(String[] args) {
    for (Product product : getProducts()) {
      System.out.println(product.getDescription());
    }

    // ordinea in care se executa constructorii intr-o ierarhie de clase
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

    ElectronicProduct[] electronicProducts = new ElectronicProduct[10];

    Product[] products = new Product[2];
    products[0] = laptop;
    products[1] = lego;
    return products;
  }
}
