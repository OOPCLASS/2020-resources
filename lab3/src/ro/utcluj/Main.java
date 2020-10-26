package ro.utcluj;


import ro.utcluj.model.Author;
import ro.utcluj.model.product.boardgame.Boardgame;
import ro.utcluj.model.product.book.Book;
import ro.utcluj.model.product.Product;

public class Main {

  public static void main(String[] args) {

    // hello

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
