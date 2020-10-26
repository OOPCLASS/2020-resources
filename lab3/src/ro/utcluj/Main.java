package ro.utcluj;


import ro.utcluj.model.Author;
import ro.utcluj.model.Boardgame;
import ro.utcluj.model.Book;
import ro.utcluj.model.Product;

public class Main {

  public static void main(String[] args) {
    for (Product product : getProducts()) {
      if (product != null) {
        System.out.println(product.getDescription());
      }
    }
  }

  private static Product[] getProducts() {
    Book book = new Book();
    book.setTitle("Degetica");
    Author author = new Author();
    author.setName("Degetel");
//    book.setAuthor(author);

    Boardgame boardgame = new Boardgame();
    boardgame.setTitle("Alhambra");
    boardgame.setNumberOfPieces(10);

    Product[] products = new Product[3];
    products[0] = book;
    products[1] = boardgame;
    products[2] = null;
    return products;
  }
}
