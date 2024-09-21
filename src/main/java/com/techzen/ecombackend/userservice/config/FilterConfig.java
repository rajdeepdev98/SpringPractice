package com.techzen.ecombackend.userservice.config;

import com.techzen.ecombackend.userservice.filters.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author : Rajdeep Deb
 * Date   : 10-09-2024
 * Time   : 05:35 PM
 */
@Configuration
public class FilterConfig {



    @Bean
    public FilterRegistrationBean<MyFilter>filter1(){

        FilterRegistrationBean<MyFilter>f1= new FilterRegistrationBean<>();
        f1.setFilter(new MyFilter());
        f1.addUrlPatterns("/api/v1/test");
//        f1.

        f1.setOrder(1);
        return f1;

    }
//    @Bean
//    public FilterRegistrationBean<MyFilter>filter2(){
//
//        FilterRegistrationBean<MyFilter>f1= new FilterRegistrationBean<>();
//        f1.setFilter(new MyFilter());
//        f1.addUrlPatterns("/api/v1/*");
//        f1.setOrder(1);
//        return f1;
//
//    }
}
