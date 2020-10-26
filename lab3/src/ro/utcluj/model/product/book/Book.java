package ro.utcluj.model.product.book;

import ro.utcluj.model.Author;
import ro.utcluj.model.product.Product;

public class Book extends Product {

  private Author author;

  public Book() {
    System.out.println("Initializing Book");
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public void doSomething() {
    System.out.println("no");
  }
}
