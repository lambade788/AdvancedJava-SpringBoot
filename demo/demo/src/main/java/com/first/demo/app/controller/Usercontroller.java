package com.first.demo.app.controller;
// 🔹 Defines the package (folder structure) of your project

import com.first.demo.app.service.Userservice;
import com.first.demo.app.model.User;
import org.jspecify.annotations.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
// 🔹 These are Spring Boot annotations used to build REST APIs

import java.time.LocalDateTime;
import java.util.*;


@RestController

@RequestMapping("/users")
public class Usercontroller {
    private Userservice userservice;

    public Usercontroller(Userservice userservice) {
        this.userservice = userservice;
    }


    @PostMapping
    public ResponseEntity<User> createuser(@RequestBody @NonNull User user){
        User createduser = userservice.createuser(user);
        return new ResponseEntity<>(createduser,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateuser(@RequestBody User user){
       User updated = userservice.updateduser(user);
       if(updated == null)
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        return ResponseEntity.status(HttpStatus.OK).body(user);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> Delete(@PathVariable int id){
        boolean isdeleted = userservice.deleteduser(id);
        if(!isdeleted)
            return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }

//    @GetMapping({"/users", "/user/{id}"})
    @GetMapping
    public List<User> getuser(){
        return userservice.getallusers();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getuser(@PathVariable(value = "userId",required = false) int id){
        User user = userservice.getuserbyid(id);
        if(user == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{userId}/orders/{orderid}")
    public ResponseEntity<User> getuserorder(@PathVariable("userId") int id,@PathVariable int orderid){
        System.out.println("Order Id :"+orderid);
        User user = userservice.getuserbyid(id);
        if(user == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<List<User>> serachuser(
            @RequestParam(required = false,defaultValue = "Rahul") String name,
            @RequestParam(required = false,defaultValue = "Rahul") String email){
        return ResponseEntity.ok(userservice.usersearch(name,email));
    }

    @GetMapping("/info/{id}")
    public String getinfo(
            @PathVariable int id,
            @RequestParam String name,
            @RequestHeader("User-Agent") String useragent)
    {
        return "user agent"+useragent+
                ":" + id +
                ":" + name;
    }

}