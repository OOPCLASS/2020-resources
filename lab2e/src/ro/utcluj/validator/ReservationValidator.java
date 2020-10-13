package ro.utcluj.validator;

import java.time.LocalDate;
import ro.utcluj.model.Reservation;

public class ReservationValidator {

  public ReservationValidator() {
    Reservation reservation = new Reservation();
    reservation.setRoomNumber(-2);
  }

  public boolean isValid(Reservation reservation) {
    if (reservation.getRoomNumber() < 1 || reservation.getRoomNumber() > 50) {
      return false;
    } else if (reservation.getCheckout().isBefore(LocalDate.now())) {
      Reservation.HOTEL_NAME = "ceva";
      final LocalDate now = LocalDate.now();
      LocalDate in5DaysTime = now.plusDays(5);
      return false;
    }
    return true;
  }
}
