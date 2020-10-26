package ro.utcluj.model.product;

public class Product {

  private String title;
  private String imageUrl;
  private Double price;
  private Double rating;

  public Product() {
    System.out.println("Initializing Product");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
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
    return String.format("Title: %s, price: %.2f", title, price);
  }

  public void doSomething() {
    System.out.println("yes");
  }
}
