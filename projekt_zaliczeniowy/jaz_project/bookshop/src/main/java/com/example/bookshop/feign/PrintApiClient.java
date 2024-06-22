package com.example.bookshop.feign;


import org.openapitools.api.PrintApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "print-api", url = "http://localhost:8081")
public interface PrintApiClient extends PrintApi {


    @PostMapping("/print")
    ResponseEntity<Resource> generatePdfOrderReport();
}
