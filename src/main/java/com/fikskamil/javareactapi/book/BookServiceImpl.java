package com.fikskamil.javareactapi.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Book updateBook(CreateBookDto createBookDto, Long bookId) {
        Optional<Book> byId = bookRepository.findById(bookId);
        if (byId.isPresent()) {
            Book book = byId.get();
            book.setTitle(createBookDto.title());
            book.setAuthor(createBookDto.author());
            book.setIsbn(createBookDto.isbn());
            return bookRepository.save(book);
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
