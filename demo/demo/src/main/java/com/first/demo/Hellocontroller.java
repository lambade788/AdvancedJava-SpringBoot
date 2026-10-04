package com.first.demo;

import com.first.demo.app.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hellocontroller {

    @GetMapping("/hello")
    public String sayhello(){
        return "Hello world.";
    }

//    @GetMapping("/user")
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getuser(){
//        User user = new User(1,"Rahul","rahul@gmail.com");
        return new User(1,"Rahul","rahul@gmail.com");
//        return user;
    }
}
