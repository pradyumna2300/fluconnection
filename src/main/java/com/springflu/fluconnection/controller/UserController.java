package com.springflu.fluconnection.controller;


import com.springflu.fluconnection.entity.User;
import com.springflu.fluconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    private ResponseEntity<String> registerUser(@RequestBody User user){
        //save the user
        String msg = service.saveUser(user);

        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
