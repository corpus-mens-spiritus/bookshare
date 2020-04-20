package org.bookshare.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Book, String> {
     Object insert(Book book);
}
