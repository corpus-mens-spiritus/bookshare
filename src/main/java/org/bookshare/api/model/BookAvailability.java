package org.bookshare.api.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class BookAvailability {
    private UUID bookId;
    private List<String> possibleActions;
    private Boolean available;
}
