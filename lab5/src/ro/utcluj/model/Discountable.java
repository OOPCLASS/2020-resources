package ro.utcluj.model;

public interface Discountable {

  int something = 10;

  Double getDiscount();

  Long getId();

  default void doSomething() {
    System.out.println("ceva");
  }
}
