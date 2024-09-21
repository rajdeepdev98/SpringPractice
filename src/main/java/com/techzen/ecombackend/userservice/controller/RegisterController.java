package com.techzen.ecombackend.userservice.controller;

import com.techzen.ecombackend.userservice.entity.User;
import com.techzen.ecombackend.userservice.service.UserService;
import com.techzen.ecombackend.userservice.utils.HeaderGenerator;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 01:14 PM
 */
@RestController
@RequestMapping("/api/v1")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<User> addUser(@RequestBody User user, HttpServletRequest request){

        if (Objects.nonNull(user)) {
            try {
                userService.saveUser(user);
                return new ResponseEntity<User>(user, HeaderGenerator.getHeadersForSuccessPostMethod(request,user.getId()), HttpStatus.CREATED);
            } catch (Exception e) {

                e.printStackTrace();
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);


            }

        }
        return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
    }
}
