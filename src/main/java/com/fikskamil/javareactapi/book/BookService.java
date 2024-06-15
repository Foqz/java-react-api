package com.fikskamil.javareactapi.book;

import java.util.List;

public interface BookService {
    Book getBookById(Long bookId);

    List<Book> getAllBooks();

    Book createBook(CreateBookDto createBookDto);
}
