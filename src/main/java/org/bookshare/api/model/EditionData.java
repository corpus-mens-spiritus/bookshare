package org.bookshare.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EditionData {
    private String title;
    private String language;
    private String editorial;
    private String isbn;
    private String year;
}
