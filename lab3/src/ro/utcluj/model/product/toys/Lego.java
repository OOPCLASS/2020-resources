package ro.utcluj.model.product.toys;

import ro.utcluj.model.product.Product;

public class Lego extends Product {

  private Integer numberOfPieces;

  public Lego() {
    System.out.println("Initializing Lego");
  }

  public Integer getNumberOfPieces() {
    return numberOfPieces;
  }

  public void setNumberOfPieces(Integer numberOfPieces) {
    this.numberOfPieces = numberOfPieces;
  }
}
