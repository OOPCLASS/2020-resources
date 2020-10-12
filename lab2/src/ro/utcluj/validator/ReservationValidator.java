package ro.utcluj.validator;

import java.time.LocalDate;
import ro.utcluj.Reservation;

public class ReservationValidator {

  public static boolean isValid(Reservation reservation) {
    if (reservation == null) {
      return false;
    } else if (reservation.getRoomNumber() == null || reservation.getRoomNumber() < 1 || reservation.getRoomNumber() > 100) {
      return false;
    } else if (LocalDate.now().isAfter(reservation.getExitDate())) {
      return false;
    }
    return true;
  }
}
