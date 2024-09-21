package com.techzen.ecombackend.userservice.filters;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

/**
 * Author : Rajdeep Deb
 * Date   : 10-09-2024
 * Time   : 06:24 PM
 */
public class CustomRequest extends HttpServletRequestWrapper {
    public CustomRequest(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getHeader(String name) {
        return super.getHeader(name);
    }
    public void putHeader(String name,String value){

    }
}
