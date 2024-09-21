package com.techzen.ecombackend.userservice.repository;

import com.techzen.ecombackend.userservice.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 12:13 PM
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
}
