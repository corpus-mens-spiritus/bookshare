package org.bookshare.api.model.responses;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BookAdditionResponse {
    private UUID bookId;
}
