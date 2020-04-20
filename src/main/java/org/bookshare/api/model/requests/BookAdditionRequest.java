package org.bookshare.api.model.requests;

import lombok.Data;
import org.bookshare.api.model.BookPermission;
import org.bookshare.api.model.EditionData;

import java.util.List;
import java.util.UUID;

@Data
public class BookAdditionRequest {
    private UUID library;
    private String title;
    private List<String> authors;
    private String year;
    private String synopsis;
    private EditionData editionData;
    private String languageCode;
    private String coverPath;
    private List<BookPermission> permissions;
}
