package ro.utcluj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import ro.utcluj.model.Client;
import ro.utcluj.model.Reservation;
import ro.utcluj.validator.ReservationValidator;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Client[] clients = new Client[10];
//    clients[0]

    List<Client> clientList = new ArrayList<>();
    clientList.add(new Client());
    List<String> clientLastNames = clientList.stream().map(Client::getLastName).collect(Collectors.toList());
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

    // display a list of clients
    // add/remove/edit clients

    // a list of reservations
    // add/remove/edit reservations

    int a = 10;
    String hello = "hello";
    Client firstClient = new Client("George");
    firstClient.presentYourself();
    firstClient.setLastName("");
    firstClient.setUniqueRegistrationNumber("111");

    firstClient = new Client();

    Client secondClient = new Client("Mirela", "Pop");
    secondClient.presentYourself();

    firstClient.presentYourself();

    Reservation reservation = new Reservation();
    reservation.setClient(firstClient);
    reservation.setRoomNumber(-1);

    ReservationValidator reservationValidator = new ReservationValidator();
    if (reservationValidator.isValid(reservation)) {
      //saveToDB(reservation);
    }

  }
}
