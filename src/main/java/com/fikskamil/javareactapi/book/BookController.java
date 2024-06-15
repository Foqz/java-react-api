package com.fikskamil.javareactapi.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/books"))
@RequiredArgsConstructor
class BookController {
    private final BookService bookService;


    @GetMapping(produces = "application/json")
    Book getBookById(@RequestParam Long bookId) {
        return bookService.getBookById(bookId);
    }
}
