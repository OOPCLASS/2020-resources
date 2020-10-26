package ro.utcluj.model.product.book;

public class EducationalBook extends Book {

  private String subject;

  public EducationalBook() {
    System.out.println("Initializing EducationalBook");
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  // Book is a Product
  // EducationalBook is a Book
  // Client is a Hotel
  // Reservation is a Client
}
