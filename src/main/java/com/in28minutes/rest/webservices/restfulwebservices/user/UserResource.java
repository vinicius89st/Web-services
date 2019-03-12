/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vinicius
 */

@RestController
public class UserResource {
    
    @Autowired
    private UserDaoService service;
    @GetMapping("/users")
    public List<User> retieveAllUser(){
        return service.findAll();
    }
    
    @GetMapping("/users/{id}")
    public User RetriveUser(@PathVariable int id){
        return service.findOne(id);
    }
    
    @PostMapping("/users")
    public  User createUser(User user){
        return service.save(user);
    }
    
}
