package com.techzen.ecombackend.userservice.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Author : Rajdeep Deb
 * Date   : 08-09-2024
 * Time   : 02:18 PM
 */

public class HeaderGenerator {

    public static HttpHeaders getHeadersForSuccessGetMethod() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
        return httpHeaders;
    }
    public static HttpHeaders getHeadersForError() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/problem+json; charset=UTF-8");
        return httpHeaders;
    }
    public static HttpHeaders getHeadersForSuccessPostMethod(HttpServletRequest request, Long newResourceId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        try {
            httpHeaders.setLocation(new URI(request.getRequestURI() + "/" + newResourceId));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
        return httpHeaders;
    }

}
