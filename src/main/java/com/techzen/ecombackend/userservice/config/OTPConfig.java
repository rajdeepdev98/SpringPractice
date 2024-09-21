package com.techzen.ecombackend.userservice.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Author : Rajdeep Deb
 * Date   : 16-09-2024
 * Time   : 05:23 PM
 */
@Configuration
@Getter
@Setter
@NoArgsConstructor

public class OTPConfig {

    @Value("${app.otp.accountSID}")
    private String accountSID;
    @Value("${app.otp.authtoken}")
    private String authToken;
}
