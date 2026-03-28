package com.library.dea.service;

import com.library.dea.dto.BookDTO;
import com.library.dea.entity.Author;
import com.library.dea.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BookService {

    //create method (POST)
    Book add(Book book);
    //show all books (GET)
    List<Book> showAll();
    //pagination
    Page<Book> getBooks(Pageable pageable);
    List<Book> getAllByTitle(String title);
    List<Book> getAllByAuthor(String author);

    List<Book> getAllByMinPrice(Double price);

    List<Book> getAllByMinAmount(Integer amount);
//    List<Author> getAllAuthors();
    //show book by id (GET)
    Book showById(Integer id);

//   Author findAuthorById(Long id);

    Book update(Integer id, BookDTO updatedBook);

    //delete method (DELETE)
    void deleteBook(Integer id);

    //Pagination
    Page<Book> findPaginated(int page, int size);
    //search
    Page<Book> search(String keyword, int page, int size);


    void saveDto(BookDTO bookDTO);

}
