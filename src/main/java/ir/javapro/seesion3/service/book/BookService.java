package ir.javapro.seesion3.service.book;

import ir.javapro.seesion3.dto.request.BookRequest;
import ir.javapro.seesion3.dto.response.BookResponse;
import ir.javapro.seesion3.model.Book;

public interface BookService {

    BookResponse save(BookRequest bookRequest);
}
