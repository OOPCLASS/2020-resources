package ro.utcluj;

import java.time.LocalDate;
import ro.utcluj.validator.ReservationValidator;

public class Main {

    public static void main(String[] args) {
	      // write your code here

        // caiet in care inregistreaza clientii
        // - nume prenume
        // - CNP
        // - serie nr CI
        // - scopul vizitei

        // caiet in care inregistreaza rezervarile
        // - nume client
        // - numar camera
        // - numar persoane
        // - data intrare - data iesire



        Client firstClient = new Client("George", "Pop");
        firstClient.presentYourself();

        Client secondClient = new Client();
        secondClient.firstName = "Mirela";
        secondClient.presentYourself();

        firstClient.presentYourself();

        LocalDate exitDate = LocalDate.now().plusDays(5);
        final Reservation reservation = new Reservation(firstClient, exitDate);
//        reservation.setRoomNumber(-5);
        System.out.println(Reservation.HOTEL_NAME);

        System.out.println(Reservation.HOTEL_NAME);

        System.out.println(ReservationValidator.isValid(null));
    }
}
