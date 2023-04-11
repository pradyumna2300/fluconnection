package com.springflu.fluconnection.service;

import com.springflu.fluconnection.entity.Booking;

import com.springflu.fluconnection.repo.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepo repo;
    public String saveUser(Booking booking){
        repo.save(booking);
        return "Appointment Book ";


    }
}
