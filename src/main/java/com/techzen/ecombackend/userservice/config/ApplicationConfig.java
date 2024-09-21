package com.techzen.ecombackend.userservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 08:09 PM
 */

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class ApplicationConfig {

    private String abc;



}
