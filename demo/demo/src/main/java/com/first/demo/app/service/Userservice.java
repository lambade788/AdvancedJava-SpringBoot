package com.first.demo.app.service;

import com.first.demo.app.controller.Usercontroller;
import com.first.demo.app.exception.UsernotFoundexception;
import com.first.demo.app.model.User;
import org.jspecify.annotations.NonNull;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class Userservice {
    private Map<Integer, User> USERDB = new HashMap<>();

    private final Logger logger = LoggerFactory.getLogger(Userservice.class);
    public User createuser(@NonNull User user) {
        logger.info("Creating user.... INFO");
        logger.debug("Creating user.... DEBUG");
        logger.trace("Creating user.... TRACE");
        logger.warn("Creating user.... WARN");
        logger.error("Creating user.... ERROR");
        System.out.println(user.getEmail());
        USERDB.putIfAbsent(user.getId(), user);
        return user;
    }

    public User updateduser(User user) {
        if(!USERDB.containsKey(user.getId())){
            logger.error("Error when finding user with id {} ", user.getId());
            throw new IllegalArgumentException("User with id "+user.getId()+" does not exists.");}
        USERDB.put(user.getId(), user);
        return user;
    }

    public boolean deleteduser(int id) {
        if(!USERDB.containsKey(id))
            throw new UsernotFoundexception("no users found in database.");
        USERDB.remove(id);
        return true;
    }

    public List<User> getallusers() {
        if(USERDB.isEmpty())
            throw new UsernotFoundexception("no users found in database.");
        return new ArrayList<>(USERDB.values());
    }

    public User getuserbyid(int id) {
        return USERDB.get(id);
    }

    public List<User> usersearch(String name, String email) {
        return USERDB.values().stream()
                .filter(u -> name == null || u.getName().trim().equalsIgnoreCase(name.trim()))
                .filter(u -> email == null || u.getEmail().trim().equalsIgnoreCase(email.trim()))
                .toList();
    }
}
