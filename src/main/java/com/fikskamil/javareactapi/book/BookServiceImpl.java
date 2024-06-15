package com.fikskamil.javareactapi.book;

import org.springframework.stereotype.Service;

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
}
