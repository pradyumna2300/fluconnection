package com.springflu.fluconnection.controller;


import com.springflu.fluconnection.entity.Booking;

import com.springflu.fluconnection.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping("/booking")
    private ResponseEntity<String> registerUser(@RequestBody Booking booking){
        //save the user
        String msg = service.saveUser(booking);

        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
