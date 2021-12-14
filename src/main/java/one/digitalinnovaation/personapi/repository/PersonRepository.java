package one.digitalinnovaation.personapi.repository;

import one.digitalinnovaation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
