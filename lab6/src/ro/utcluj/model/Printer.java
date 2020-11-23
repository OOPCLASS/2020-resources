package ro.utcluj.model;

public class Printer {

  private int totalPages; // numarul de foi pe care le mai are imprimanta
  private int ink; // valoare in ml de cerneala pe care o mai are imprimanta

  public void print(int pages) {
    // scadem din totalPages pages
    // aruncam OutOfPaperException - checked

    // scadem din ink pages * 2 ml
    // aruncam OutOfInkException - unchecked
  }
}
