package ro.utcluj.model.product.electronics;

import ro.utcluj.model.product.Product;

public class ElectronicProduct extends Product {

  private Integer powerSourceVoltage;

  public ElectronicProduct() {
    System.out.println("Initializing ElectronicProduct");
  }

  public ElectronicProduct(Integer powerSourceVoltage) {
    System.out.println("Initializing ElectronicProduct with param");
    this.powerSourceVoltage = powerSourceVoltage;
  }

  public Integer getPowerSourceVoltage() {
    return powerSourceVoltage;
  }

  public void setPowerSourceVoltage(Integer powerSourceVoltage) {
    this.powerSourceVoltage = powerSourceVoltage;
  }

  public void doSomething() {
    System.out.println("no");
  }

  // SubClass is a SuperClass
  // Laptop is an ElectronicProduct
  // ElectronicProduct is a Product

  // Client extends Hotel
  // Client is a Hotel
}
