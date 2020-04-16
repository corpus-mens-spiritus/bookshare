package org.bookshare.api.repositories;

import org.bookshare.api.model.Library;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibrariesRepository extends MongoRepository<Library, String> {

}
