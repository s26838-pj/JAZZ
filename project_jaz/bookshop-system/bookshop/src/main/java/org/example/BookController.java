package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookService bookService;

    @Autowired
    private BookOrderClient bookOrderClient;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        book.setId(id);
        return bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/report")
    public void orderReport() {
        List<Book> books = bookService.getAllBooks();
        List<BookVisit> bookVisits = books.stream()
                .map(book -> new BookVisit(book.getId(), book.getTitle(), book.getVisitCount()))
                .toList();
        bookOrderClient.processVisits(bookVisits);
    }
}
