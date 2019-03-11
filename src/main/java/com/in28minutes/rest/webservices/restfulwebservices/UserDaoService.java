package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informix
 */

@Component
public class UserDaoService {
    
    
    private static ArrayList<User> usuario = new ArrayList<>();
    
    static{
        usuario.add(new User(1,"jose"));
        usuario.add(new User(2,"joao"));
        usuario.add(new User(3,"raga"));
        usuario.add(new User(4,"lucas"));
    }
    
    public List<User> findAll(){
        return usuario;
    }
    
    public User save(User user){
        usuario.add(user);
        return user;
    }
    
    
    public User findOne(int id){
        for (User user : usuario){
            if(user.getId() == id)
                return user;
        }
        return null;
    }
   
    
}
