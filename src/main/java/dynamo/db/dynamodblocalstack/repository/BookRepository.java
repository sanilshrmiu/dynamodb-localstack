package dynamo.db.dynamodblocalstack.repository;

import dynamo.db.dynamodblocalstack.model.Book;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface BookRepository extends CrudRepository<Book,String> {

    Optional<Book> findById(String id);

}
