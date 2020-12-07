package ro.utcluj.agenda.repository;

import org.springframework.data.repository.CrudRepository;

public interface AbstractRepository<T> extends CrudRepository<T, Long> {

}
