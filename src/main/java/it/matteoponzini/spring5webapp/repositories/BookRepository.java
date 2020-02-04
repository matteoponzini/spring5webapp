package it.matteoponzini.spring5webapp.repositories;

import it.matteoponzini.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
