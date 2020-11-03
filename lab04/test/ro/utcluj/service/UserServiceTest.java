package ro.utcluj.service;

import org.junit.Assert;
import org.junit.Test;
import ro.utcluj.model.User;

public class UserServiceTest {

  @Test
  public void testUsersFilteringOnNullVector() {
    UserService userService = new UserService();

    User[] users = null;

    User[] result = userService.filterUsers(users);

    Assert.assertNull(result);
  }

  @Test
  public void testUsersFilteringOnEmptyVector() {
    UserService userService = new UserService();

    User[] users = new User[1];

    User[] result = userService.filterUsers(users);

    Assert.assertNotNull(result);
    for (User user : result) {
      Assert.assertNull(user);
    }
  }
}
