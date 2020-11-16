package ro.utcluj.model;

import java.time.LocalDate;

public interface CreationDateAware extends Identifiable, Discountable {

  LocalDate getCreatedAt();
}
