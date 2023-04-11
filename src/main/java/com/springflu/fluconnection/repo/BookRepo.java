package com.springflu.fluconnection.repo;

import com.springflu.fluconnection.entity.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Booking,Integer> {

}
