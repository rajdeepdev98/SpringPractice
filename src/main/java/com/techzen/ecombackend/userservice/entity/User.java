package com.techzen.ecombackend.userservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.Cascade;

/**
 * Author : Rajdeep Deb
 * Date   : 07-09-2024
 * Time   : 05:26 PM
 */
@Getter
@Setter
@Entity
@Table(name = "users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_name",nullable = false,unique = true,length = 50)
    private String userName;

    @Column(name = "user_password",nullable = false,unique = true,length = 50)
    private String userPassword;

    @Column(name = "active")
    private int active;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_details_id",referencedColumnName = "id")
    private UserDetails userDetails;

    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private UserRole role;
}
