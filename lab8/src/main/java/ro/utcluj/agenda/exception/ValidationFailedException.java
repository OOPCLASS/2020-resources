package ro.utcluj.agenda.exception;

public class ValidationFailedException extends RuntimeException {

  public ValidationFailedException(String message) {
    super(message);
  }
}
