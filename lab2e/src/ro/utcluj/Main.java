package ro.utcluj;

public class Main {

  public static void main(String[] args) {
    // write your code here

    // a book where he keeps track of clients
    // - firstName lastName
    // - the amount of money spent on reservations
    // - uniqueRegistrationNumber (CNP)

    // a book where he keeps track of reservations
    // - checkin / checkout dates
    // - booking type / Booking.com/phone/email/fax
    // - numberOfPeople
    // - roomNumber
    // - client details

    // a list of clients
    // add/remove/edit clients

    // a list of reservations
    // add/remove/edit reservations

    int a = 10;
    String hello = "hello";
    Client firstClient = new Client("George");
    firstClient.presentYourself();

    Client secondClient = new Client("Mirela", "Pop");
    secondClient.presentYourself();

    firstClient.presentYourself();
  }
}
