package ro.utcluj.model;

// import statements

public class Client {

  // attributes / class fields / class variables
  private String firstName;
  private String lastName;
  private Double reservationsSpendings;
  private String uniqueRegistrationNumber;

  // constructors
  public Client() {
    this("default-first-name", "default-last-name");
  }

  public Client(String firstName) {
    this(firstName, (String) null);
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

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUniqueRegistrationNumber() {
    return uniqueRegistrationNumber;
  }

  public void setUniqueRegistrationNumber(String uniqueRegistrationNumber) {
    this.uniqueRegistrationNumber = uniqueRegistrationNumber;
  }

  public Double getReservationsSpendings() {
    return reservationsSpendings;
  }

  public void setReservationsSpendings(Double reservationsSpendings) {
    this.reservationsSpendings = reservationsSpendings;
  }
}
