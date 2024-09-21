package com.techzen.ecombackend.userservice.service;

import com.techzen.ecombackend.userservice.config.OTPConfig;
import com.techzen.ecombackend.userservice.filters.MyInterceptor;
import com.techzen.ecombackend.userservice.model.SendOTPModel;
import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.Verification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author : Rajdeep Deb
 * Date   : 16-09-2024
 * Time   : 05:22 PM
 */
@Service
public class OTPServiceImpl {

    @Autowired
    private OTPConfig otpConfig;

    private static Logger log= LoggerFactory.getLogger(OTPServiceImpl.class);


    public void sendOTP(SendOTPModel model){

        Twilio.init(otpConfig.getAccountSID(), otpConfig.getAuthToken());
        Verification verification = Verification.creator(
                        "VA3dff4a920aeef270fa90d93880947af1",
                        "+919957297418",
                        "sms")
                .create();
        System.out.println(verification.getSid());



        log.info(otpConfig.getAccountSID());
        log.info(otpConfig.getAuthToken());
    }


}
