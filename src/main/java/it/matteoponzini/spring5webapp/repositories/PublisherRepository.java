package it.matteoponzini.spring5webapp.repositories;

import it.matteoponzini.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
