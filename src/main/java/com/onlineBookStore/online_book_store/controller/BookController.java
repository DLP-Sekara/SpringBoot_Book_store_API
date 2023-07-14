package com.onlineBookStore.online_book_store.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
@CrossOrigin
public class BookController {

    @GetMapping("/getBook")
    public String getBook(){
        return "book one";
    }
}
