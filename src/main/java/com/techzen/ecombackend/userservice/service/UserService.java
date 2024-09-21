package com.techzen.ecombackend.userservice.service;

import com.techzen.ecombackend.userservice.entity.User;

import java.util.List;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 12:43 PM
 */
public interface UserService {

    List<User>getAllUsers();
    User getUserById(Long id);
    User getUserByName(String name);
    User saveUser(User user);
}
