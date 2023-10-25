package mitconsult.services;

import mitconsult.models.entities.Book;

import java.util.List;

public interface BookService {

    void create(Book book);

    List<Book> findAll();
}
