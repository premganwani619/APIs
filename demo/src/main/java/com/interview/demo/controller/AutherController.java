package com.interview.demo.controller;

import com.interview.demo.entity.Auther;
import com.interview.demo.service.AutherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AutherController {

    @Autowired
    AutherService autherService;

    @GetMapping("/")
    public String helloWorld() {
        return "hello";
    }

    @PostMapping("/add")
    public Auther createAuther(@RequestBody Auther autherObj) {
        return autherService.saveAuther(autherObj);
    }

    @GetMapping("/{id}")
    public Auther getAuther(@PathVariable int id) {
        return autherService.getAuther(id);
    }

    @DeleteMapping("/{id}")
    public Auther deleteAuther(@PathVariable int id) {
        return autherService.deleteAuther(id);
    }

    @PutMapping("/{id}")
    public Auther putAuther(@PathVariable int id, @RequestBody Auther autherObj) {
        return autherService.updateAuther(id, autherObj);
    }


}
