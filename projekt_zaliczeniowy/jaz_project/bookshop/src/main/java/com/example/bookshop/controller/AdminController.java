package com.example.bookshop.controller;

import com.example.bookshop.feign.PrintApiClient;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final PrintApiClient printApiClient;

    public AdminController(PrintApiClient printApiClient) {
        this.printApiClient = printApiClient;
    }

    @GetMapping("/order-report")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> generateOrderReport() {
        printApiClient.generatePdfOrderReport();
        return ResponseEntity.ok().build();
    }
}
