package com.example.bookshop.service;

import com.example.bookshop.model.Book;
import com.example.bookshop.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @Transactional
    public Book updateBook(Long id, Book bookDetails) {
        Book book = getBookById(id);
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setGenre(bookDetails.getGenre());
        book.setPrice(bookDetails.getPrice());
        book.setPages(bookDetails.getPages());
        book.setAvailable(bookDetails.getAvailable());
        book.setVisits(bookDetails.getVisits());
        book.setQuantity(bookDetails.getQuantity());

        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Transactional
    public void incrementVisits(Long id) {
        Book book = getBookById(id);
        book.setVisits(book.getVisits() + 1);
        bookRepository.save(book);
    }

    @Transactional
    public void purchaseBook(Long id) {
        Book book = getBookById(id);
        if (book.getAvailable() && book.getQuantity() > 0) {
            book.setQuantity(book.getQuantity() - 1);
            bookRepository.save(book);
        } else {
            throw new RuntimeException("Book is not available");
        }
    }
}
