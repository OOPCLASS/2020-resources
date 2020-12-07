package ro.utcluj.agenda.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.utcluj.agenda.model.Person;
import ro.utcluj.agenda.service.PersonService;
import ro.utcluj.agenda.validator.PersonValidator;

@RestController
public class PersonController {

  @Autowired
  private PersonService personService;

  @Autowired
  private PersonValidator personValidator;

  @PostMapping("/persons")
  public Person save(Person person) {
    personValidator.validate(person);
    return personService.save(person);
  }

  @GetMapping("/persons")
  public List<Person> findAll() {
    return personService.findAll();
  }
}
