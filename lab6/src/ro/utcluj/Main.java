package ro.utcluj;

import java.io.BufferedReader;
import java.io.FileReader;
import ro.utcluj.model.ValueTooLowException;

public class Main {

  public static void main(String[] args) {
    // write your code here
//    Long aLong = Long.valueOf("1231sdasd");

    System.out.println(doSomethingElse());
  }

  public static int doSomethingElse() {
    try {
      Long.parseLong("123sdas");
      System.out.println("try");
      return 1;
    } catch (NumberFormatException exception) {
      System.out.println("catch");
    } catch (IllegalArgumentException exception) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
      return 2;
    }
  }

  public static void doSomething(int myValue) throws ValueTooLowException {
    if (myValue < 10) {
      throw new ValueTooLowException();
    } else {
      System.out.println("All good");
    }
  }
}
