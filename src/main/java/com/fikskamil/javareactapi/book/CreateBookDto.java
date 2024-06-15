package com.fikskamil.javareactapi.book;

public record CreateBookDto(
        String title,
        String author,
        String isbn
) {
}
