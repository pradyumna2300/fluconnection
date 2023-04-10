package com.springflu.fluconnection.repo;

import com.springflu.fluconnection.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
