package org.bookshare.api.services;

import lombok.extern.slf4j.Slf4j;
import org.bookshare.api.model.Book;
import org.bookshare.api.model.entities.BookEntity;
import org.bookshare.api.repositories.BooksRepository;
import org.bookshare.api.services.mappers.BooksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private BooksMapper booksMapper;

    public UUID addBookToLibrary(Book book) {
        UUID bookId = UUID.randomUUID();
        BookEntity bookEntity = booksMapper.bookToBookEntity(book, bookId);

        booksRepository.insert(bookEntity);

        return bookId;
    }
}
