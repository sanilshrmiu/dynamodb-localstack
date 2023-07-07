package dynamo.db.dynamodblocalstack.service;

import dynamo.db.dynamodblocalstack.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Optional<Book> findById(String id);

    List<Book> findAll();

    Book save(Book book);

    Book update(Book book, String id);

    void deleteById(String id);

}
