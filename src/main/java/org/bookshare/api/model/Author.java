package org.bookshare.api.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.UUID;

@Document(collection = "authors")
@Data
@Builder
public class Author {
    @Id
    private Integer id;

    @Indexed
    private UUID authorId;

    private String name;
    private String surname;
    private UUID photoId;
    private String birth;
    private String death;
    private String biography;
}
