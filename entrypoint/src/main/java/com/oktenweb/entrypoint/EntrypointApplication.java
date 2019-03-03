package com.oktenweb.entrypoint;

import com.oktenweb.entrypoint.controllers.MainController;
import com.oktenweb.library.service.LibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {LibraryService.class, MainController.class})
public class EntrypointApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntrypointApplication.class, args);
    }

}
