package ro.utcluj.model;

public class Boardgame extends Product {

  private Integer numberOfPieces;

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
