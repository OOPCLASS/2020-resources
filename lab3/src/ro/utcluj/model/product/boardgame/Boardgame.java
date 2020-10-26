package ro.utcluj.model.product.boardgame;

import ro.utcluj.model.product.Product;

public class Boardgame extends Product {

  private Integer numberOfPieces;

  public Boardgame() {
    System.out.println("Initializing Boardgame");
  }

  public Integer getNumberOfPieces() {
    return numberOfPieces;
  }

  public void setNumberOfPieces(Integer numberOfPieces) {
    this.numberOfPieces = numberOfPieces;
  }

  @Override
  public String getDescription() {
    return String.format("Title: %s, number of pieces: %d", getTitle(), numberOfPieces);
  }
}
