package com.lqm.demo.interceptor;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义一个过滤器将自定义的请求封装类传下去
 */
public class CachingRequestBodyFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest request = (HttpServletRequest) servletRequest;

        BodyReaderHttpServletRequestWrapper wrapper = new BodyReaderHttpServletRequestWrapper(request);

        filterChain.doFilter(wrapper, servletResponse);



    }
}
