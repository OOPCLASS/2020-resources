package ro.utcluj.model.product;

public class Product {

  private String imageUrl;
  private String title;
  private Double price;
  protected Double rating;

  public Product() {
    System.out.println("Initializing Product");
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public String getDescription() {
    return String.format("Title: %s", title);
  }
}
