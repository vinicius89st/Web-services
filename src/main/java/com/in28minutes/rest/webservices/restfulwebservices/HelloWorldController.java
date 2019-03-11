/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in28minutes.rest.webservices.restfulwebservices;
//Controler hands Htttp request

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author informix
 */

//Rest controller that can handle Rest request
@RestController
public class HelloWorldController {
    //mapping a rest request to this url
    @Autowired
    private UserDaoService service;
    @GetMapping("/user")
    public List<User> retriveAllUser(){
        return service.findAll();
    }
    
}
