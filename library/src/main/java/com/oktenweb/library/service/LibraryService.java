package com.oktenweb.library.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LibraryService {


    public List<String> libraryResolver() {
        return Arrays.asList("Moby dick", "Big dick", "Dick duck");
    }
}
