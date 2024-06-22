package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void incrementVisitCount(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setVisitCount(book.getVisitCount() + 1);
        bookRepository.save(book);
    }
}