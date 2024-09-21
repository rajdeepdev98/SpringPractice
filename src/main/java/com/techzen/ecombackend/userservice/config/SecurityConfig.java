package com.techzen.ecombackend.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Author : Rajdeep Deb
 * Date   : 20-09-2024
 * Time   : 12:11 PM
 */
@Configuration
@SuppressWarnings("deprecation")
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests().anyRequest().permitAll();
        http.csrf().disable();

        http.httpBasic();
        http.formLogin();

        return http.build();
    }
}
