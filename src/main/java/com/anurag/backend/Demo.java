package com.anurag.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping
    public String student() {
        return "Name: Mahesh<br>" +
               "Department: ECE<br>" +
               "Roll No: 123";
    }
}