package org.bookshare.api.controllers;

import org.bookshare.api.model.Book;
import org.bookshare.api.model.responses.BookAdditionResponse;
import org.bookshare.api.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/book" , produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {
    @Autowired
    private BooksService booksService;

    @PostMapping
    public ResponseEntity addBookToLibrary(@RequestBody Book book) {

        UUID bookId = booksService.addBookToLibrary(book);

        BookAdditionResponse response = BookAdditionResponse.builder()
                .bookId(bookId)
                .build();

        return new ResponseEntity(response, HttpStatus.OK);
    }
}
