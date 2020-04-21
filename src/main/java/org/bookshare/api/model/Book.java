package org.bookshare.api.model;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Book {
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
