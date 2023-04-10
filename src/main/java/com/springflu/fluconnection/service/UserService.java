package com.springflu.fluconnection.service;

import com.springflu.fluconnection.entity.User;
import com.springflu.fluconnection.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    public String saveUser(User user){
        repo.save(user);
        return "user register";


    }
}
