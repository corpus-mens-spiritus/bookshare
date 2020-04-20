package org.bookshare.api.model.requests;

import lombok.Data;
import org.bookshare.api.model.BookPermission;

import java.util.List;

@Data
public class BookAdditionRequest {
    private String coverPath;
    private String library;
    private String title;
    private String author;
    private String year;
    private String synopsis;
    private String languageCode;
    private List<BookPermission> permissions;
}
