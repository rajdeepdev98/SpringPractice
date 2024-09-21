package com.techzen.ecombackend.userservice.controller;

import com.techzen.ecombackend.userservice.model.SendOTPModel;
import com.techzen.ecombackend.userservice.service.OTPServiceImpl;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Author : Rajdeep Deb
 * Date   : 16-09-2024
 * Time   : 04:30 PM
 */
@RestController
@RequestMapping("/api/v1/otp")
public class OtpController {

    @Autowired
    private OTPServiceImpl otpService;

    @PostMapping("/send")
    public ResponseEntity<?>sendOTP(@RequestBody SendOTPModel send){



            otpService.sendOTP(send);
            return ResponseEntity.ok("Success");





    }
}
