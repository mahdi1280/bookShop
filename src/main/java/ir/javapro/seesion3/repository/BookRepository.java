package ir.javapro.seesion3.repository;

import ir.javapro.seesion3.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
