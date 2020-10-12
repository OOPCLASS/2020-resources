package ro.utcluj;

public class Client {

  public String firstName = "hello";
  private String lastName;
  private String uniqueRegistrationNumber;
  private String ciSeries;
  private Integer ciNumber;
  private String country;

  public Client() {
    this("first-name");
    lastName = "last-name";
    uniqueRegistrationNumber = "1827732";
    presentYourself();
  }

  public Client(String firstName) {
    this.firstName = firstName;
  }

  public Client(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void presentYourself() {
    System.out.printf("Hello there, my name is %s\n", firstName);
  }
}
