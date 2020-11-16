package ro.utcluj.model;

import java.time.LocalDate;

public class Apple implements CustomComparable, CreationDateAware {

  @Override
  public LocalDate getCreatedAt() {
    return null;
  }

  @Override
  public Double getDiscount() {
    return null;
  }

  @Override
  public Long getId() {
    return null;
  }

  @Override
  public void doSomething() {

  }

  @Override
  public String getFieldToCompare() {
    return null;
  }

  @Override
  public int compareTo(CustomComparable comparable) {
    return 0;
  }
}
