package ro.utcluj.agenda.validator;

public interface AppValidator<T> {

  void validate(T t);
}
