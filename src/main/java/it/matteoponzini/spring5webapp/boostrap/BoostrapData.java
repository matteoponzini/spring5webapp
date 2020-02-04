package it.matteoponzini.spring5webapp.boostrap;

import it.matteoponzini.spring5webapp.domain.Author;
import it.matteoponzini.spring5webapp.domain.Book;
import it.matteoponzini.spring5webapp.domain.Publisher;
import it.matteoponzini.spring5webapp.repositories.AuthorRepository;
import it.matteoponzini.spring5webapp.repositories.BookRepository;
import it.matteoponzini.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BoostrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BoostrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setAddress("Milano");
        publisher.setCity("St petersbug");
        publisher.setState("Italy");
        publisher.setName("Matteo");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain D", "12345");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Jdon");
        Book ejb = new Book("EJB", "12345");
        rod.getBooks().add(ejb);
        ejb.getAuthors().add(rod);
        ejb.setPublisher(publisher);
        publisher.getBooks().add(ejb);
        authorRepository.save(rod);
        bookRepository.save(ejb);
        publisherRepository.save(publisher);
        System.out.println("Number of book> "+bookRepository.count());
        System.out.println("Number of books publish> "+publisher.getBooks().size());
    }
}
