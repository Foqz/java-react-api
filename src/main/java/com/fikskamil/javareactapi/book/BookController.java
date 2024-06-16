package com.fikskamil.javareactapi.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/books"))
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
class BookController {
    private final BookService bookService;


    @GetMapping(path ="{bookId}", produces = "application/json")
    Book getBookById(@PathVariable Long bookId) {
        return bookService.getBookById(bookId);
    }

    @GetMapping
    List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    Long addBook(@RequestBody CreateBookDto createBookDto) {
        return bookService.createBook(createBookDto).getId();
    }

    @PutMapping("{bookId}")
    Long updateBook(@RequestBody CreateBookDto createBookDto, @PathVariable Long bookId) {
        return bookService.updateBook(createBookDto, bookId).getId();
    }
}
