package com.spring.api.controllers;

import com.spring.api.models.User;
import com.spring.api.services.IUserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService){
        this.userService = userService;
    }

    @RequestMapping(value ="/",
                    method = RequestMethod.GET)
    public ResponseEntity GetUsers() {
        Set<User> users = this.userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @RequestMapping(value = "/{id}",
                    method = RequestMethod.GET)
    public ResponseEntity GetUser(@RequestParam @NonNull Long id) {
        return ResponseEntity.ok(this.userService.getUserById(id));
    }

}
