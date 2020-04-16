package org.bookshare.api.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Document(collection = "libraries")
@Data
@Builder
public class Library {
    @Id
    private String id;

    @Indexed
    private UUID libraryId;

    private String propertyName;
    private String contactName;
    private List<BookAvailability> books;
}
