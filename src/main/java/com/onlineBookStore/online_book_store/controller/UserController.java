package com.onlineBookStore.online_book_store.controller;
import com.onlineBookStore.online_book_store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "get";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "save";
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "deleted";
    }
}
