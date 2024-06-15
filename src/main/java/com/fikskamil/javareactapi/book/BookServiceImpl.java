package com.fikskamil.javareactapi.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

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
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(CreateBookDto createBookDto) {
        Book build = Book.builder()
                .title(createBookDto.title())
                .author(createBookDto.author())
                .isbn(createBookDto.isbn())
                .build();
        return bookRepository.save(build);
    }
}
