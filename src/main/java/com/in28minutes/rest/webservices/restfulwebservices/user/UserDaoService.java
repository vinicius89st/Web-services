package com.in28minutes.rest.webservices.restfulwebservices.user;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */

@Component
public class UserDaoService {
    int userId = 5;
    
    private static ArrayList<User> usuario = new ArrayList<>();
    
    static{
        usuario.add(new User(1,"jose", new Date()));
        usuario.add(new User(2,"joao", new Date()));
        usuario.add(new User(3,"raga", new Date()));
        usuario.add(new User(4,"lucas", new Date()));
    }
    
    public List<User> findAll(){
        return usuario;
    }
    
    public User save(User user){
        user.setId(userId++);
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
