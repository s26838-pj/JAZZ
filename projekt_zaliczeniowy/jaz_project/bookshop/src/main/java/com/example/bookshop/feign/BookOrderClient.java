package com.example.bookshop.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "book-order", url = "http://localhost:8081/orders")
public interface BookOrderClient {

    @GetMapping("/print")
    String printOrders();


}


