package org.bookshare.api.repositories;

import org.bookshare.api.model.entities.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<BookEntity, String> {

}
