package ro.utcluj.model;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

  @Test
  public void testGetProducts() {
    User user = new User();
    user.setName("name");

    Assert.assertEquals("namee", user.getName());
  }

  @Test
  public void testAddProductToList() {

  }
}
