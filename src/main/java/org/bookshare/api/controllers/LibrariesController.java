package org.bookshare.api.controllers;

import org.bookshare.api.model.requests.LibraryCreationRequest;
import org.bookshare.api.services.LibrariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Controller
@RequestMapping(value = "/" , consumes = MediaType.APPLICATION_JSON_VALUE)
public class LibrariesController {
    @Autowired
    private LibrariesService librariesService;

    @PostMapping(value = "/library")
    public ResponseEntity<String> addLibrary(@RequestBody LibraryCreationRequest libraryRequest) {
        String propertyName = libraryRequest.getPropertyName();
        String contactName = libraryRequest.getContactName();

        UUID libraryUUID = librariesService.addLibrary(propertyName, contactName);

        return ResponseEntity.ok("Library with UUID " + libraryUUID + "added correctly");
    }
}
