package com.techzen.ecombackend.userservice.config;

import com.techzen.ecombackend.userservice.filters.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author : Rajdeep Deb
 * Date   : 10-09-2024
 * Time   : 01:19 AM
 */
@Configuration
public class IntereptorConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(interceptor).addPathPatterns("/api/v1/*").excludePathPatterns("/api/v1/lol","/api/v1/lol2","/api/v1/otp/send");
    }
}
