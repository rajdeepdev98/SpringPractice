package com.techzen.ecombackend.userservice.service;

import com.techzen.ecombackend.userservice.entity.User;
import com.techzen.ecombackend.userservice.entity.UserRole;
import com.techzen.ecombackend.userservice.repository.UserRepository;
import com.techzen.ecombackend.userservice.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 12:51 PM
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.findByUserName(name);
    }

    @Override
    public User saveUser(User user) {

        user.setActive(1);
        UserRole role = userRoleRepository.findUserRoleByRoleName("ROLE_USER");
        user.setRole(role);
        return userRepository.save(user);
    }
}
