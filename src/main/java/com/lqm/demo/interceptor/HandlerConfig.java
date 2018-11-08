package com.lqm.demo.interceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class HandlerConfig {

    @Bean
    public FilterRegistrationBean cachingRequestBodyFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        CachingRequestBodyFilter filter = new CachingRequestBodyFilter();
        bean.setFilter(filter);
        bean.setAsyncSupported(false);
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);

        return bean;

    }

}
