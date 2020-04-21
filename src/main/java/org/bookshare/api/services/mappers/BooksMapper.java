package org.bookshare.api.services.mappers;

import org.bookshare.api.model.Book;
import org.bookshare.api.model.entities.BookEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BooksMapper {
    private ModelMapper mapper;

    public BooksMapper() {
        this.mapper = new ModelMapper();
    }

    public BookEntity bookToBookEntity(Book book, UUID bookId) {
        BookEntity bookEntity = mapper.map(book, BookEntity.class);
        bookEntity.setBookId(bookId);

        return bookEntity;
    }
}
