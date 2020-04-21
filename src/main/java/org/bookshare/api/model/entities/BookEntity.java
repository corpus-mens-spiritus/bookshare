package org.bookshare.api.model.entities;

import lombok.Data;
import org.bookshare.api.model.BookPermission;
import org.bookshare.api.model.EditionData;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Document(collection = "books")
@Data
public class BookEntity {
    @Id
    private String id;

    @Indexed
    private UUID bookId;

    private UUID library;
    private String title;
    private List<String> authors;
    private String year;
    private String synopsis;
    private EditionData editionData;
    private String language;
    private String coverPath;
    private List<BookPermission> permissions;
}
