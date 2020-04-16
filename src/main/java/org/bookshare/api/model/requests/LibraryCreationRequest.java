package org.bookshare.api.model.requests;

import lombok.Data;

@Data
public class LibraryCreationRequest {
    private String propertyName;
    private String contactName;
}
