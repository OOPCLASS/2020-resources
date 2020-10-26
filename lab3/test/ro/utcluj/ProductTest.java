package ro.utcluj;

import org.junit.Assert;
import org.junit.Test;
import ro.utcluj.model.product.electronics.Laptop;
import ro.utcluj.model.product.Product;

public class ProductTest {

  @Test
  public void testProductCreation() {
    Laptop product = new Laptop();
    product.setTitle("Laptop");

    Assert.assertEquals("Laptop", product.getTitle());
    Assert.assertTrue(product instanceof Product);
    Assert.assertTrue(product instanceof Laptop);
  }
}
