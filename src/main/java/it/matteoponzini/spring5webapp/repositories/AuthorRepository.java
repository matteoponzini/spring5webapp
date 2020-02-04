package it.matteoponzini.spring5webapp.repositories;

import it.matteoponzini.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {

}
