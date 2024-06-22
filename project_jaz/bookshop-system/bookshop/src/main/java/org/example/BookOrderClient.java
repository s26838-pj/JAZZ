package org.example;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@EnableFeignClients(basePackages = "org.example")
@FeignClient(name = "bookOrderClient", url = "http://localhost:8081/orders")
public interface BookOrderClient {

    @PostMapping
    void processVisits(@RequestBody List<BookVisit> bookVisits);
}