package com.techzen.ecombackend.userservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Author : Rajdeep Deb
 * Date   : 07-09-2024
 * Time   : 05:27 PM
 */
@Entity
@Getter
@Setter
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "first_name", nullable = false, length = 50)
    private String firstName;
    @Column (name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Column (name = "email", nullable = false, unique = true, length = 50)
    private String email;
    @Column (name = "phone_number", length = 15)
    private String phoneNumber;
    @Column (name = "street", length = 30)
    private String street;
    @Column (name = "street_number", length = 10)
    private String streetNumber;
    @Column (name = "zip_code", length = 6)
    private String zipCode;
    @Column (name = "locality", length = 30)
    private String locality;
    @Column (name = "country", length = 30)
    private String country;

    @OneToOne(mappedBy = "userDetails")
    @JsonIgnore
    private User user;
}
