package org.bookshare.api.services;

import lombok.extern.slf4j.Slf4j;
import org.bookshare.api.model.Library;
import org.bookshare.api.repositories.LibrariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
@Slf4j
public class LibrariesService {
    @Autowired
    private LibrariesRepository librariesRepository;

    public UUID addLibrary(String propertyName, String contactName) {
        UUID libraryUUID = UUID.randomUUID();

        Library library = Library.builder()
                .libraryId(libraryUUID)
                .propertyName(propertyName)
                .contactName(contactName)
                .books(new ArrayList<>())
                .build();

        librariesRepository.insert(library);

        return libraryUUID;
    }
}
