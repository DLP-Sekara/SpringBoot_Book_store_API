package com.onlineBookStore.online_book_store.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/order")
public class OrderController {

    @GetMapping(value = "/getOrders",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getOrders(){
        return "orders";
    }
}
