package org.bookshare.api.controllers;

import org.bookshare.api.model.requests.BookAdditionRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book" , produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {
    @PostMapping
    public ResponseEntity addBookToLibrary(@RequestBody BookAdditionRequest body) {
        return new ResponseEntity(HttpStatus.OK);
    }
}
