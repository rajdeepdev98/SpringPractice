package com.techzen.ecombackend.userservice.controller;

import com.techzen.ecombackend.userservice.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 08:28 PM
 */
@RestController
@RequestMapping("/api/v1")
public class TestController {

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/test")
    public ResponseEntity<?>test(){

        System.out.println(applicationConfig.getAbc());
        return ResponseEntity.ok("Success");

    }
}
