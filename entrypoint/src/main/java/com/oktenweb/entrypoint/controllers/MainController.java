package com.oktenweb.entrypoint.controllers;

import com.oktenweb.library.service.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/lib")
    public List<String> lib() {
        return libraryService.libraryResolver();
    }
}
