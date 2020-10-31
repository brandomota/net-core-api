package com.spring.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = {"/"},method = {RequestMethod.GET})
    public ResponseEntity GetUsers() {
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }

}
