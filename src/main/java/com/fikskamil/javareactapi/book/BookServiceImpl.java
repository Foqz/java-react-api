package com.fikskamil.javareactapi.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class BookServiceImpl implements BookService {
    @Override
    public Book getBookById(Long bookId) {

        return Book.builder()
                .id(bookId)
                .title("test")
                .author("test")
                .isbn("qweqweqweqweqwe")
                .build();
    }

    @Override
    public List<Book> getAllBooks() {
        return List.of(Book.builder()
                        .title("test")
                        .author("author")
                        .isbn("qwe")
                        .id(1L)
                        .build(),
                Book.builder()
                        .title("test2")
                        .author("author2")
                        .isbn("qwe2")
                        .id(1L)
                        .build());
    }
}
