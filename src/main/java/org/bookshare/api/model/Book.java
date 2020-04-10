package org.bookshare.api.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Document(collection = "books")
@Data
@Builder
public class Book {
    @Id
    private String id;

    @Indexed
    private UUID bookId;

    private String title;
    private List<String> authors;
    private String year;
    private EditionData editionData;
}
