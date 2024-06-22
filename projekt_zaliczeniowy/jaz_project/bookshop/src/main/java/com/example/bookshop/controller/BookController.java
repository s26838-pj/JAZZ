package com.example.bookshop.controller;

import com.example.bookshop.model.Book;
import com.example.bookshop.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        bookService.incrementVisits(id);
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        return bookService.updateBook(id, bookDetails);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/purchase")
    public ResponseEntity<Void> purchaseBook(@PathVariable Long id) {
        bookService.purchaseBook(id);
        return ResponseEntity.ok().build();
    }
}
