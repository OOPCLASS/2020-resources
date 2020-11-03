package ro.utcluj.service;

import ro.utcluj.model.User;

public class UserService {

  public User[] filterUsers(User[] users) {
    User[] result = new User[10];
    int index = 0;
    if (users == null) {
      return null;
    }
    for (User user : users) {
      if (user != null) {
        if (!user.getName().startsWith("a")) {
          result[index++] = user;
        }
      }
    }
    return result;
  }
}
