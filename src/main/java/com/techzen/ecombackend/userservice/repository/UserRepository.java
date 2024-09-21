package com.techzen.ecombackend.userservice.repository;

import com.techzen.ecombackend.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 12:12 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);

}
