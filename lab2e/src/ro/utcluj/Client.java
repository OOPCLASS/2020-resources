package ro.utcluj;

// import statements

public class Client {

  // attributes / class fields / class variables
  public String firstName;
  private String lastName;
  private Double reservationsSpendings;
  private String uniqueRegistrationNumber;

  // constructors
  public Client() {
    this("default-first-name", "default-last-name");
  }

  public Client(String firstName) {
    this(firstName, (Double) null);
  }

  public Client(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Client(String firstName, Double reservationsSpendings) {
  }

  public Client(Double reservationsSpendings, String firstName) {
  }

  // methods / functions
  public void presentYourself() {
    System.out.printf("Hello there, my name is %s\n", firstName);
  }
}
