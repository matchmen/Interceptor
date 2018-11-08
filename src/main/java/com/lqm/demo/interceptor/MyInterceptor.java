package com.lqm.demo.interceptor;

import com.sun.istack.internal.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;

@Component
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        BodyReaderHttpServletRequestWrapper wrapper = (BodyReaderHttpServletRequestWrapper) ((ServletRequest)request);




        System.out.println(wrapper.getBodyString());


        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {


    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {


        BodyReaderHttpServletRequestWrapper wrapper = (BodyReaderHttpServletRequestWrapper) ((ServletRequest)request);




        System.out.println("岁数大所"+wrapper.getBodyString());
    }






}
