package org.bookshare.api.services;

import lombok.extern.slf4j.Slf4j;
import org.bookshare.api.model.requests.BookAdditionRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BooksService {
    public UUID addBookToLibrary(BookAdditionRequest body) {
        return UUID.randomUUID();
    }
}