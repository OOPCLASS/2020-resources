package ro.utcluj.model;

public class Book extends Product {

  private Author author;


  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  @Override
  public String getDescription() {
    if (author != null) {
      return String.format("Title: %s, author name: %s", getTitle(), author.getName());
    }
    return super.getDescription();
  }
}
