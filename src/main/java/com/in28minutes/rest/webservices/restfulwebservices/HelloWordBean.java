/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloWordBean {

    private String message;
   
    public HelloWordBean(String message){
        this.message = message;
    }
    
    public void setMessage (String message){
        this.message = message;
    }
    
    public String getMessage(){
        return message;
    }
    
    public String toString(){
        return String.format("HelloWorldBean [message=%s]", message);
    }
    
}
