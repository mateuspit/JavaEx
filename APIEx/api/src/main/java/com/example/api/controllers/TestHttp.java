package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/HTTPMethods")
public class TestHttp {
    @GetMapping("/GET")
    public String getMethodName() {
        return "This is GET HTTP Method";
    }

    @PostMapping("/POST")
    public String postMethodName(@RequestBody String entity) {
        return "This is POST HTTP Method. body: " + entity;
    }

    @PutMapping("/PUT/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        return "This is PUT HTTP Method. ID: " + id + " body: " + entity;
    }

    @PatchMapping("/PATCH/{id}")
    public String patchMethodName(@PathVariable String id, @RequestBody String entity) {
        return "This is PATCH HTTP Method. ID: " + id + " body: " + entity;
    }

    @DeleteMapping("/DELETE/{id}")
    public String deleteMethodName(@PathVariable String id) {
        return "This is DELETE HTTP Method. ID: " + id;
    }

}
