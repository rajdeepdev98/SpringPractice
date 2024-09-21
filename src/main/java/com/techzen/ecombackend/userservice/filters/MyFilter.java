package com.techzen.ecombackend.userservice.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Author : Rajdeep Deb
 * Date   : 10-09-2024
 * Time   : 05:33 PM
 */
//@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Inside myfilter");
//        servletRequest
        //here we are passing the mutated request through the filter chain
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        CustomRequest customRequest= new CustomRequest(request);
        filterChain.doFilter(customRequest,servletResponse);

        System.out.println("Outside myfilter");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
