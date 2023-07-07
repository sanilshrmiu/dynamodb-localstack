package dynamo.db.dynamodblocalstack.service.impl;

import dynamo.db.dynamodblocalstack.model.Book;
import dynamo.db.dynamodblocalstack.repository.BookRepository;
import dynamo.db.dynamodblocalstack.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Optional<Book> findById(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book, String id) {
        Optional<Book> existingBook = bookRepository.findById(id);
        if (existingBook.isPresent()) {
            book.setId(id);
            Book updatedBook = bookRepository.save(book);
            return updatedBook;
        }
        return null;
    }

    @Override
    public void deleteById(String id) {
        bookRepository.deleteById(id);
    }
}
