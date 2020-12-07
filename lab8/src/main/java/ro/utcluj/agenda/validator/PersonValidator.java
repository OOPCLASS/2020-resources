package ro.utcluj.agenda.validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import ro.utcluj.agenda.exception.ValidationFailedException;
import ro.utcluj.agenda.model.Person;

@Component
public class PersonValidator implements AppValidator<Person> {

  @Override
  public void validate(Person person) {
    if (person == null) {
      throw new ValidationFailedException("Person must not be null!");
    } else if (StringUtils.isBlank(person.getFullName())) {
      throw new ValidationFailedException("Person full name not specified");
    } else if (StringUtils.isBlank(person.getPhoneNumber())) {
      throw new ValidationFailedException("Person phone number not specified");
    }
  }
}
